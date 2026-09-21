package com.example.ui.components

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import java.util.regex.Pattern

/**
 * RichTextFormatter parses formatted questions, options, and explanations into styled AnnotatedStrings.
 * 
 * Supports:
 * - Underlines: `<u>word</u>`, `__word__`, `_word_`
 * - Bold: `**word**`, `<b>word</b>`, `<strong>word</strong>`
 * - Italics: `*word*`, `<i>word</i>`, `<em>word</em>`
 * - Strikethrough: `~~word~~`, `<s>word</s>`, `<del>word</del>`
 * - Automatic target-word underlining for UTME English lexis questions (antonyms, synonyms, idioms, sounds)
 * - Strips all raw formatting markers (*, **, _, __, <u>, etc.) so students never see markdown syntax.
 */
object RichTextFormatter {

    private val HTML_TAG_REGEX = Regex("<(/?)(\\w+)(?:\\s+[^>]*)?>", RegexOption.IGNORE_CASE)
    private val MARKDOWN_IMAGE_REGEX = Regex("!\\[[^\\]]*\\]\\([^)]+\\)")
    private val HTML_IMAGE_REGEX = Regex("<img\\b[^>]*>", RegexOption.IGNORE_CASE)
    private val BRACKET_TAG_REGEX = Regex("^\\[(?:JAMB|UTME|WAEC)[^\\]]*\\]\\s*", RegexOption.IGNORE_CASE)
    private val LEADING_PREFIX_REGEX = Regex("^(?:JAMB|UTME|WAEC)\\s*(?:[A-Za-z\\s]+)?\\s*\\d{4}[:\\s]*(?:Q\\.?\\s*\\d+)?[:\\-\\.]?\\s*", RegexOption.IGNORE_CASE)
    private val LEADING_NUM_REGEX = Regex("^(?:\\d{1,3}[.)\\-:]|q\\d{1,3}[.:]|question\\s+\\d{1,3}[.:]|no\\.?\\s*\\d{1,3}[.:])\\s*", RegexOption.IGNORE_CASE)

    // Non-target ALL CAPS keywords to exclude from automatic underlining
    private val EXCLUDED_CAPS_WORDS = setOf(
        "JAMB", "UTME", "WAEC", "NECO", "CBT", "NABTEB", "PREPZA",
        "NOT", "WHICH", "CHOOSE", "OPPOSITE", "NEAREST", "MEANING",
        "UNDERLINED", "ITALICIZED", "OPTION", "OPTIONS", "SECTION",
        "COMPREHENSION", "PASSAGE", "QUESTION", "QUESTIONS", "BELOW",
        "FOLLOWING", "BEST", "APPROPRIATE", "CORRECT", "STATEMENT",
        "STATEMENTS", "WORD", "WORDS", "PHRASE", "PHRASES", "FILL",
        "GAP", "GAPS", "BLANK", "BLANKS", "IDIOM", "IDIOMS", "SOUND",
        "VOWEL", "CONSONANT", "STRESS", "EMPHASIS", "RHYME", "ANTONYM",
        "SYNONYM", "LEXIS", "STRUCTURE", "PART", "TYPE"
    )

    /**
     * Cleans raw text by removing raw diagram/image markup and unwanted prefix tags.
     */
    fun cleanRawText(rawText: String, isStem: Boolean = false): String {
        var text = rawText
        text = MARKDOWN_IMAGE_REGEX.replace(text, "")
        text = HTML_IMAGE_REGEX.replace(text, "")
        if (isStem) {
            text = BRACKET_TAG_REGEX.replace(text, "")
            text = LEADING_PREFIX_REGEX.replace(text, "")
            text = LEADING_NUM_REGEX.replace(text, "")
        }
        return text.trim()
    }

    /**
     * Converts formatted text to AnnotatedString with full styling and no raw markup.
     */
    fun parseToAnnotatedString(
        rawText: String,
        isStem: Boolean = false,
        highlightColor: Color? = null
    ): AnnotatedString {
        val cleaned = cleanRawText(rawText, isStem = isStem)
        if (cleaned.isBlank()) return AnnotatedString("")

        val isLexisTargetQuestion = isStem && isUnderlineIntentQuestion(cleaned)

        // Pre-process: if question has an intent to underline target word, replace ALL-CAPS target words or asterisked words with explicit <u> tags
        val preprocessed = if (isLexisTargetQuestion) {
            markUnderlineTargetsInLexis(cleaned)
        } else {
            cleaned
        }

        return buildAnnotatedFromFormattedText(preprocessed)
    }

    /**
     * Checks if the question instructions refer to an "underlined", "italicized", "opposite in meaning",
     * "nearest in meaning", "best interprets", or "vowel sound" target word.
     */
    private fun isUnderlineIntentQuestion(text: String): Boolean {
        val lower = text.lowercase()
        return lower.contains("underlined") ||
                lower.contains("opposite in meaning") ||
                lower.contains("nearest in meaning") ||
                lower.contains("italicized") ||
                lower.contains("best interprets") ||
                lower.contains("same vowel sound") ||
                lower.contains("same consonant sound") ||
                lower.contains("correctly interprets") ||
                lower.contains("stress on the") ||
                lower.contains("word in italics") ||
                lower.contains("phrase in italics")
    }

    /**
     * In questions like:
     * "Choose the option opposite in meaning to the underlined word: Her arguments were completely TENABLE during the debate."
     * or "The officer was *rebuked* by the convener."
     * converts target word into `<u><b>target</b></u>` so it's guaranteed to be formatted correctly.
     */
    private fun markUnderlineTargetsInLexis(text: String): String {
        var result = text

        // Convert *word* or **word** or _word_ to <u><b>word</b></u> if in target position
        // Asterisk pattern: *word*
        result = result.replace(Regex("(?<!\\*)\\*([^*\\n]+)\\*(?!\\*)")) { match ->
            "<u><i>${match.groupValues[1]}</i></u>"
        }

        // Double asterisk: **word**
        result = result.replace(Regex("\\*\\*([^*\\n]+)\\*\\*")) { match ->
            "<u><b>${match.groupValues[1]}</b></u>"
        }

        // Single underscore around words: _word_
        result = result.replace(Regex("(?<=\\s|^|[(\"'])_([A-Za-z0-9\\s'-]+)_(?=\\s|$|[)\".,!?:;])")) { match ->
            "<u>${match.groupValues[1]}</u>"
        }

        // Check if there are ALL-CAPS words in the sentence (after colon or newline) that should be underlined
        val lines = result.split("\n")
        val processedLines = lines.map { line ->
            // If the line already has <u> tags, leave it
            if (line.contains("<u>", ignoreCase = true)) {
                line
            } else {
                // Find all uppercase words of length >= 3 not in excluded list
                line.replace(Regex("\\b([A-Z]{3,20})\\b")) { match ->
                    val word = match.groupValues[1]
                    if (word in EXCLUDED_CAPS_WORDS) {
                        word
                    } else {
                        "<u><b>$word</b></u>"
                    }
                }
            }
        }

        return processedLines.joinToString("\n")
    }

    // Temporary placeholder tokens to protect fill-in-the-gap blanks from markdown parser
    private const val GAP_TOKEN_PREFIX = "%%PREPZA_GAP_"
    private const val GAP_TOKEN_SUFFIX = "%%"

    /**
     * Core state-machine parser that builds an AnnotatedString from markdown & HTML tags.
     */
    private fun buildAnnotatedFromFormattedText(input: String): AnnotatedString {
        // Step 1: Protect Fill-in-the-gap blanks (e.g. "______", "____", "___", "[____]") from markdown parser
        val gapReplacements = mutableListOf<String>()
        var preparedInput = input

        // Match 2 or more consecutive underscores
        preparedInput = preparedInput.replace(Regex("_{2,}|\\[_{2,}\\]|\\[\\s*\\.{3,}\\s*\\]")) { match ->
            val idx = gapReplacements.size
            // Standardize gap display length to 6 underscores for clean consistent layout
            gapReplacements.add("______")
            "$GAP_TOKEN_PREFIX$idx$GAP_TOKEN_SUFFIX"
        }

        return buildAnnotatedString {
            var i = 0
            val len = preparedInput.length

            val isBold = mutableListOf<Boolean>()
            val isItalic = mutableListOf<Boolean>()
            val isUnderline = mutableListOf<Boolean>()
            val isStrike = mutableListOf<Boolean>()

            fun currentSpanStyle(): SpanStyle {
                var weight = FontWeight.Normal
                var style = FontStyle.Normal
                var decoration = TextDecoration.None

                if (isBold.isNotEmpty() && isBold.last()) {
                    weight = FontWeight.Bold
                }
                if (isItalic.isNotEmpty() && isItalic.last()) {
                    style = FontStyle.Italic
                }
                val hasUnderline = isUnderline.isNotEmpty() && isUnderline.last()
                val hasStrike = isStrike.isNotEmpty() && isStrike.last()

                decoration = when {
                    hasUnderline && hasStrike -> TextDecoration.combine(listOf(TextDecoration.Underline, TextDecoration.LineThrough))
                    hasUnderline -> TextDecoration.Underline
                    hasStrike -> TextDecoration.LineThrough
                    else -> TextDecoration.None
                }

                return SpanStyle(
                    fontWeight = if (weight == FontWeight.Bold) FontWeight.Bold else null,
                    fontStyle = if (style == FontStyle.Italic) FontStyle.Italic else null,
                    textDecoration = if (decoration != TextDecoration.None) decoration else null
                )
            }

            fun appendStyledChar(c: Char) {
                val style = currentSpanStyle()
                val start = length
                append(c)
                val end = length
                if (style != SpanStyle()) {
                    addStyle(style, start, end)
                }
            }

            fun appendStyledString(str: String, customStyle: SpanStyle? = null) {
                val style = customStyle ?: currentSpanStyle()
                val start = length
                append(str)
                val end = length
                if (style != SpanStyle()) {
                    addStyle(style, start, end)
                }
            }

            while (i < len) {
                // Check for GAP token
                if (preparedInput.startsWith(GAP_TOKEN_PREFIX, i)) {
                    val endToken = preparedInput.indexOf(GAP_TOKEN_SUFFIX, i + GAP_TOKEN_PREFIX.length)
                    if (endToken != -1) {
                        val numStr = preparedInput.substring(i + GAP_TOKEN_PREFIX.length, endToken)
                        val idx = numStr.toIntOrNull()
                        val gapStr = if (idx != null && idx in gapReplacements.indices) gapReplacements[idx] else "______"
                        // Append gap with bold weight so it is clearly visible and never lost
                        appendStyledString(gapStr, SpanStyle(fontWeight = FontWeight.Bold))
                        i = endToken + GAP_TOKEN_SUFFIX.length
                        continue
                    }
                }

                // Check for HTML tags: <u>, </u>, <b>, </b>, <i>, </i>, <s>, </s>, <strong>, <em>, <del>, <sup>, <sub>, <br>
                if (preparedInput[i] == '<') {
                    val closeBracket = preparedInput.indexOf('>', i)
                    if (closeBracket != -1) {
                        val tagContent = preparedInput.substring(i + 1, closeBracket).trim()
                        val isClosing = tagContent.startsWith("/")
                        val tagName = (if (isClosing) tagContent.substring(1) else tagContent).split(" ", "\t")[0].lowercase()

                        var handled = true
                        when (tagName) {
                            "u" -> {
                                if (isClosing) { if (isUnderline.isNotEmpty()) isUnderline.removeAt(isUnderline.lastIndex) }
                                else { isUnderline.add(true) }
                            }
                            "b", "strong" -> {
                                if (isClosing) { if (isBold.isNotEmpty()) isBold.removeAt(isBold.lastIndex) }
                                else { isBold.add(true) }
                            }
                            "i", "em" -> {
                                if (isClosing) { if (isItalic.isNotEmpty()) isItalic.removeAt(isItalic.lastIndex) }
                                else { isItalic.add(true) }
                            }
                            "s", "strike", "del" -> {
                                if (isClosing) { if (isStrike.isNotEmpty()) isStrike.removeAt(isStrike.lastIndex) }
                                else { isStrike.add(true) }
                            }
                            "br" -> {
                                append('\n')
                            }
                            "sup" -> {
                                // Handled inline if needed
                            }
                            "sub" -> {
                                // Handled inline if needed
                            }
                            else -> {
                                // Other HTML tags: ignore tag itself without printing it
                                handled = true
                            }
                        }

                        if (handled) {
                            i = closeBracket + 1
                            continue
                        }
                    }
                }

                // Check for Markdown bold: **text**
                if (i + 1 < len && preparedInput[i] == '*' && preparedInput[i + 1] == '*') {
                    if (isBold.isNotEmpty() && isBold.last()) {
                        isBold.removeAt(isBold.lastIndex)
                    } else {
                        isBold.add(true)
                    }
                    i += 2
                    continue
                }

                // Check for Markdown italic: *text*
                if (preparedInput[i] == '*') {
                    if (isItalic.isNotEmpty() && isItalic.last()) {
                        isItalic.removeAt(isItalic.lastIndex)
                    } else {
                        isItalic.add(true)
                    }
                    i += 1
                    continue
                }

                // Check for Markdown double underline: __text__
                if (i + 1 < len && preparedInput[i] == '_' && preparedInput[i + 1] == '_') {
                    if (isUnderline.isNotEmpty() && isUnderline.last()) {
                        isUnderline.removeAt(isUnderline.lastIndex)
                        if (isBold.isNotEmpty() && isBold.last()) isBold.removeAt(isBold.lastIndex)
                    } else {
                        isUnderline.add(true)
                        isBold.add(true)
                    }
                    i += 2
                    continue
                }

                // Check for Markdown single underline/italic: _text_
                if (preparedInput[i] == '_') {
                    if (isUnderline.isNotEmpty() && isUnderline.last()) {
                        isUnderline.removeAt(isUnderline.lastIndex)
                    } else {
                        isUnderline.add(true)
                    }
                    i += 1
                    continue
                }

                // Check for Markdown strikethrough: ~~text~~
                if (i + 1 < len && preparedInput[i] == '~' && preparedInput[i + 1] == '~') {
                    if (isStrike.isNotEmpty() && isStrike.last()) {
                        isStrike.removeAt(isStrike.lastIndex)
                    } else {
                        isStrike.add(true)
                    }
                    i += 2
                    continue
                }

                // Check for backticks `code`
                if (preparedInput[i] == '`') {
                    i += 1
                    continue
                }

                // Append normal styled character
                appendStyledChar(preparedInput[i])
                i += 1
            }
        }
    }
}

/**
 * Reusable FormattedText Composable that correctly renders rich text (underlines, bold, italics, strikethrough)
 * without ever exposing markdown tags to the candidate.
 */
@Composable
fun FormattedText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontWeight: FontWeight? = null,
    fontStyle: FontStyle? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip,
    isQuestionStem: Boolean = false
) {
    val annotatedString = remember(text, isQuestionStem) {
        RichTextFormatter.parseToAnnotatedString(text, isStem = isQuestionStem)
    }

    Text(
        text = annotatedString,
        modifier = modifier,
        style = style,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        lineHeight = lineHeight,
        textAlign = textAlign,
        maxLines = maxLines,
        overflow = overflow
    )
}
