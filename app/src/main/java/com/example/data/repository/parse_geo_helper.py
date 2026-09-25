import json
import re

# ==========================================
# 1. GEOGRAPHY 2015 (81 Questions with Answers & Explanations)
# ==========================================

geo_questions = [
    {
        "id": "geo_2015_01",
        "q": "The following are natural resources except",
        "a": "rubber", "b": "soil", "c": "water", "d": "cellphane",
        "ans": 3,
        "exp": "Cellophane is an artificial/synthetic material made from cellulose, whereas rubber, soil, and water are naturally occurring natural resources.",
        "topic": "Natural Resources"
    },
    {
        "id": "geo_2015_02",
        "q": "All these are examples of fold mountains except",
        "a": "Himalayas", "b": "Rockies", "c": "Andes", "d": "Voges Mountain",
        "ans": 3,
        "exp": "Vosges Mountain in France is an example of a block mountain (horst) formed by faulting, while Himalayas, Rockies, and Andes are fold mountains formed by compressional forces.",
        "topic": "Landforms: Mountains"
    },
    {
        "id": "geo_2015_03",
        "q": "All the following are fertile plains except",
        "a": "loess plains", "b": "alluvial plains", "c": "erosional plains", "d": "flood plain",
        "ans": 2,
        "exp": "Erosional plains are formed as a result of the washing away (denudation) of fertile topsoil, leaving behind poorer subsoil, unlike fertile depositional plains.",
        "topic": "Plains and Landforms"
    },
    {
        "id": "geo_2015_04",
        "q": "The current world population is estimated at about",
        "a": "2.0 billion", "b": "7.0 billion", "c": "6.0 billion", "d": "4.0 billion",
        "ans": 1,
        "exp": "Global human population crossed 7 billion in 2011 and is estimated around 7.3+ billion in modern past examinations.",
        "topic": "World Population"
    },
    {
        "id": "geo_2015_05",
        "q": "Soil factors in an ecosystem are referred to as",
        "a": "topographic", "b": "climatic", "c": "biotic", "d": "edaphic",
        "ans": 3,
        "exp": "Edaphic factors relate to the structure and chemical composition of the soil in an ecosystem.",
        "topic": "Ecology & Soil"
    },
    {
        "id": "geo_2015_06",
        "q": "Alternating wet and dry conditions on exposed rocks is a major cause of",
        "a": "chemical weathering", "b": "biological weathering", "c": "physical weathering", "d": "mass wasting",
        "ans": 2,
        "exp": "Alternating wetting and drying causes rock expansion and contraction leading to disintegration by physical/mechanical weathering.",
        "topic": "Weathering"
    },
    {
        "id": "geo_2015_07",
        "q": "The axis of the earth is inclined to the plane of the ecliptic at an angle of",
        "a": "66.5°", "b": "23.5°", "c": "90°", "d": "45°",
        "ans": 0,
        "exp": "The earth's axis of rotation is inclined at an angle of 66.5° (approx. 66°) to the plane of the earth's orbit (the ecliptic plane).",
        "topic": "Earth in Space"
    },
    {
        "id": "geo_2015_08",
        "q": "West Africa is located between latitudes",
        "a": "4°N and 20°N of the equator", "b": "3°N and 15°N of the equator", "c": "2°N and 10°N of the equator", "d": "10°N and 15°N of the equator",
        "ans": 0,
        "exp": "West Africa extends latitudinally from approximately 4°N (near the Gulf of Guinea) to 20°N (in the Sahara desert).",
        "topic": "Geography of West Africa"
    },
    {
        "id": "geo_2015_09",
        "q": "All the following crops are involved in plantation agriculture except",
        "a": "rubber", "b": "wheat", "c": "cocoa", "d": "oil palm",
        "ans": 1,
        "exp": "Wheat is grown extensively as a cereal grain on temperate grasslands/farms rather than as a tropical tree crop in plantation agriculture.",
        "topic": "Agriculture"
    },
    {
        "id": "geo_2015_10",
        "q": "In a food chain, the position occupied by an organism is called",
        "a": "the trophic level", "b": "energy level", "c": "the feeding level", "d": "the habitat level",
        "ans": 0,
        "exp": "The trophic level of an organism is the position it occupies in a food web/chain (e.g., primary producer, primary consumer).",
        "topic": "Ecosystem & Environment"
    },
    {
        "id": "geo_2015_11",
        "q": "Tropical rainforest can be conserved by the following practices except",
        "a": "agroforestry", "b": "deforestation", "c": "selective logging", "d": "crop rotation",
        "ans": 1,
        "exp": "Deforestation (indiscriminate felling of trees) destroys forest ecosystems rather than conserving them.",
        "topic": "Environmental Conservation"
    },
    {
        "id": "geo_2015_12",
        "q": "Population growth rate may be defined as the",
        "a": "mortality rate per unit area over a period", "b": "number of times an organism occurs within a given period", "c": "number of particular species per unit area", "d": "net change in population size resulting from births, deaths, and migration over time",
        "ans": 3,
        "exp": "Population growth rate represents the net rate at which the population increases or decreases over a specified time interval.",
        "topic": "Population Geography"
    },
    {
        "id": "geo_2015_13",
        "q": "Tall trees with buttress roots are characteristically associated with",
        "a": "rainforest", "b": "Guinea savanna", "c": "Sudan savanna", "d": "Sahel savanna",
        "ans": 0,
        "exp": "Large emergent trees in tropical rainforests develop wide buttress roots to provide mechanical support in shallow, nutrient-poor soils.",
        "topic": "Vegetation Belts"
    },
    {
        "id": "geo_2015_14",
        "q": "Which of the following resources is non-renewable?",
        "a": "livestock", "b": "minerals (petroleum/coal)", "c": "forest", "d": "soil",
        "ans": 1,
        "exp": "Minerals and fossil fuels cannot be replenished naturally within a human timescale and are exhaustible non-renewable resources.",
        "topic": "Natural Resources"
    },
    {
        "id": "geo_2015_15",
        "q": "The solar system comprises the sun and its",
        "a": "seven planets", "b": "eight planets", "c": "nine planets (historically including Pluto)", "d": "six planets",
        "ans": 1,
        "exp": "Under IAU classification the solar system consists of eight major planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.",
        "topic": "Earth in Space"
    },
    {
        "id": "geo_2015_16",
        "q": "On September 23rd (Autumnal Equinox), all places on earth experience",
        "a": "equal length of day and night (12 hours each)", "b": "complete daylight for 24 hours", "c": "longer nights and shorter days", "d": "longer days and shorter nights",
        "ans": 0,
        "exp": "During the equinoxes (March 21st and September 23rd), the sun is directly overhead at the equator, resulting in equal 12-hour day and night worldwide.",
        "topic": "Equinox & Solstice"
    },
    {
        "id": "geo_2015_17",
        "q": "Density, mortality, and birth rate are primary factors that affect",
        "a": "population", "b": "dominance", "c": "canopy cover", "d": "habitat",
        "ans": 0,
        "exp": "Population dynamics are fundamentally governed by birth rate (natality), death rate (mortality), and spatial density.",
        "topic": "Population Geography"
    },
    {
        "id": "geo_2015_18",
        "q": "The predominant system of agriculture among rural farmers in Nigeria is",
        "a": "terrace farming", "b": "irrigation farming", "c": "plantation agriculture", "d": "bush fallowing (shifting cultivation)",
        "ans": 3,
        "exp": "Bush fallowing involves clearing and farming a piece of land for a few years and then leaving it fallow to naturally restore soil fertility.",
        "topic": "Agricultural Systems"
    },
    {
        "id": "geo_2015_19",
        "q": "What type of mountain is associated with synclines and anticlines?",
        "a": "Block mountain", "b": "Fold mountain", "c": "Volcanic mountain", "d": "Residual mountain",
        "ans": 1,
        "exp": "Fold mountains are formed by lateral compressional forces causing rock strata to bend into upfolds (anticlines) and downfolds (synclines).",
        "topic": "Landforms: Mountains"
    },
    {
        "id": "geo_2015_20",
        "q": "The instrument used for recording seismic waves and vibrations of an earthquake is the",
        "a": "Epicenter", "b": "Thermometer", "c": "Hydrometer", "d": "Seismograph",
        "ans": 3,
        "exp": "A seismograph is an instrument that detects and records the intensity and duration of earthquakes.",
        "topic": "Earthquakes & Volcanism"
    },
    {
        "id": "geo_2015_21",
        "q": "All of these are recognized major industrial zones in Nigeria except",
        "a": "the western industrial zone (Lagos-Ibadan)", "b": "the south-east industrial zone (Aba-Port Harcourt-Onitsha)", "c": "the north-central/Kano-Kaduna industrial zone", "d": "the rural Guinea savanna belt",
        "ans": 3,
        "exp": "The primary manufacturing concentrations in Nigeria are the Western zone (Lagos/Ikeja), Eastern zone (Port Harcourt/Aba/Enugu), and Northern zone (Kano/Kaduna).",
        "topic": "Industrial Geography of Nigeria"
    },
    {
        "id": "geo_2015_22",
        "q": "Lines of longitude can best be described as",
        "a": "imaginary lines on the earth's surface joining the North and South Poles", "b": "the distance of a place east or west of the Greenwich meridian", "c": "the angular distance of a place north or south of the equator", "d": "parallels running around the globe",
        "ans": 0,
        "exp": "Lines of longitude (meridians) are great semicircles running from the North Pole to the South Pole.",
        "topic": "Latitude and Longitude"
    },
    {
        "id": "geo_2015_23",
        "q": "The largest planet in the solar system with distinctive light and dark cloud bands is",
        "a": "Mercury", "b": "Neptune", "c": "Jupiter", "d": "Mars",
        "ans": 2,
        "exp": "Jupiter is the largest planet in our solar system, composed largely of hydrogen and helium gas with prominent atmospheric bands.",
        "topic": "The Solar System"
    },
    {
        "id": "geo_2015_24",
        "q": "Which is the longest and largest river in Nigeria?",
        "a": "River Niger", "b": "River Benue", "c": "River Ogun", "d": "River Osun",
        "ans": 0,
        "exp": "River Niger originates in the Fouta Djallon highlands of Guinea, flowing over 4,180 km and forming Nigeria's principal drainage system.",
        "topic": "Drainage Systems of Nigeria"
    },
    {
        "id": "geo_2015_25",
        "q": "A method of representing statistical distribution on a map using points of uniform value is a",
        "a": "contour map", "b": "form line", "c": "dot map", "d": "hachure",
        "ans": 2,
        "exp": "Dot distribution maps use dots to show the spatial density and volume of geographical phenomena like population.",
        "topic": "Map Work & Cartography"
    },
    {
        "id": "geo_2015_26",
        "q": "The longest river in West Africa is",
        "a": "River Benue", "b": "River Niger", "c": "River Volta", "d": "River Senegal",
        "ans": 1,
        "exp": "River Niger is the longest river in West Africa and the third longest in Africa after the Nile and Congo rivers.",
        "topic": "Rivers of West Africa"
    },
    {
        "id": "geo_2015_27",
        "q": "Which of the following is NOT a sustainable way of conserving natural wildlife and forests?",
        "a": "adopting good farming practices", "b": "establishing forest reserves", "c": "establishing national parks and game reserves", "d": "encouraging poaching",
        "ans": 3,
        "exp": "Poaching (illegal hunting and capture of wild animals) decimates biodiversity and depletes natural resources.",
        "topic": "Conservation of Natural Resources"
    },
    {
        "id": "geo_2015_28",
        "q": "The downslope movement of weathered rock materials and soil under the direct force of gravity is called",
        "a": "weathering", "b": "mass movement (mass wasting)", "c": "catastrophism", "d": "deflation",
        "ans": 1,
        "exp": "Mass movement (or mass wasting) refers to the movement of regolith and rock debris down slopes under gravitational pull.",
        "topic": "Mass Wasting"
    },
    {
        "id": "geo_2015_29",
        "q": "A concordant horizontal sheet-like intrusion of magma along the bedding planes of sedimentary rock is called a",
        "a": "batholith", "b": "dyke", "c": "lava plain", "d": "sill",
        "ans": 3,
        "exp": "A sill is a planar intrusive sheet of igneous rock that intrudes horizontally parallel to the bedding planes of surrounding rocks.",
        "topic": "Volcanicity and Igneous Features"
    },
    {
        "id": "geo_2015_30",
        "q": "In the Southern Hemisphere, the Autumnal Equinox occurs on",
        "a": "21st March", "b": "23rd September", "c": "22nd December", "d": "21st June",
        "ans": 0,
        "exp": "When it is Spring Equinox in the Northern Hemisphere (March 21st), it is Autumnal Equinox in the Southern Hemisphere.",
        "topic": "Earth Rotation and Seasons"
    },
    {
        "id": "geo_2015_31",
        "q": "The natural satellite of the Earth is the",
        "a": "Sun", "b": "Moon", "c": "Mars", "d": "Saturn",
        "ans": 1,
        "exp": "The Moon is Earth's only permanent natural satellite, revolving around the Earth once every approximately 27.3 days.",
        "topic": "The Earth and Solar System"
    },
    {
        "id": "geo_2015_32",
        "q": "The following are direct environmental effects of overgrazing EXCEPT",
        "a": "depletion of pasture vegetation cover", "b": "soil and wind erosion of pasture land", "c": "epidemic of cattle diseases", "d": "scarcity of good pasture land",
        "ans": 2,
        "exp": "Overgrazing leads directly to soil erosion, compaction, and loss of vegetation, while cattle disease epidemics are caused by pathogens/vectors.",
        "topic": "Environmental Degradation"
    },
    {
        "id": "geo_2015_33",
        "q": "Sharp, slender, downward-growing calcite columns hanging from the roof of underground limestone caves are called",
        "a": "limestone gorges", "b": "uvalas", "c": "poljes", "d": "stalactites",
        "ans": 3,
        "exp": "Stalactites hang downward from the ceiling of caves (remember 'c' for ceiling), while stalagmites grow upward from the ground ('g' for ground).",
        "topic": "Karst Limestone Features"
    },
    {
        "id": "geo_2015_34",
        "q": "Which of the following West African countries is completely landlocked?",
        "a": "Burkina Faso", "b": "Guinea", "c": "Nigeria", "d": "Ghana",
        "ans": 0,
        "exp": "Burkina Faso (formerly Upper Volta), Mali, and Niger are landlocked West African countries without direct access to the sea.",
        "topic": "Geography of West Africa"
    },
    {
        "id": "geo_2015_35",
        "q": "The most important commercial cash crop produced in the irrigated Gezira/Nile Basin is",
        "a": "cotton", "b": "millet", "c": "sugarcane", "d": "groundnut",
        "ans": 0,
        "exp": "Long-staple cotton is the major export crop grown in the Gezira irrigation scheme between the Blue Nile and White Nile.",
        "topic": "African Agriculture"
    },
    {
        "id": "geo_2015_36",
        "q": "The average density of the continental crust (SIAL) is approximately",
        "a": "2.0 g/cm³", "b": "2.7 g/cm³", "c": "3.5 g/cm³", "d": "5.5 g/cm³",
        "ans": 1,
        "exp": "The continental crust (Sial: silica and alumina) has an average density of 2.7 g/cm³ (2700 kg/m³), lighter than the oceanic crust (Sima: 3.0 g/cm³).",
        "topic": "Structure of the Earth"
    },
    {
        "id": "geo_2015_37",
        "q": "The angular distance of a point on the earth's surface measured in degrees from the centre of the earth north or south of the equator is known as",
        "a": "orbit", "b": "latitude", "c": "axis", "d": "longitude",
        "ans": 1,
        "exp": "Latitude is the angular distance north or south of the equator, measured from 0° at the equator to 90° at the poles.",
        "topic": "Latitude and Longitude"
    },
    {
        "id": "geo_2015_38",
        "q": "True desert conditions in West Africa are found extensively in",
        "a": "Southern coastal Nigeria", "b": "Northern Mali", "c": "Southern Ghana", "d": "The Niger Delta",
        "ans": 1,
        "exp": "Northern Mali lies deep within the Sahara Desert, characterized by hyper-arid climatic conditions and sparse vegetation.",
        "topic": "Regional Geography of West Africa"
    },
    {
        "id": "geo_2015_39",
        "q": "All of these are primary elements of weather and climate EXCEPT",
        "a": "temperature", "b": "altitude", "c": "rainfall", "d": "sunshine",
        "ans": 1,
        "exp": "Altitude is a climatic control/factor that influences weather, while temperature, rainfall, pressure, humidity, wind, and sunshine are elements.",
        "topic": "Weather and Climate"
    },
    {
        "id": "geo_2015_40",
        "q": "Which of the following physical factors is a primary reason for high rural population density in river valleys?",
        "a": "fertile alluvial soils", "b": "unemployment", "c": "unfavorable climate", "d": "presence of tsetse flies",
        "ans": 0,
        "exp": "Fertile alluvial soils in river floodplains support intensive agricultural production and sustain dense human settlement.",
        "topic": "Population Distribution"
    },
    {
        "id": "geo_2015_41",
        "q": "A map of scale 1:150,000 is enlarged to 3 times its original size. What is the new representative fraction scale?",
        "a": "1 : 50,000", "b": "1 : 75,000", "c": "1 : 100,000", "d": "1 : 450,000",
        "ans": 0,
        "exp": "When a map is enlarged by factor n, the denominator of the representative fraction scale is divided by n. New scale = 1 : (150,000 / 3) = 1 : 50,000.",
        "topic": "Map Scale Calculations"
    },
    {
        "id": "geo_2015_42",
        "q": "Which of the following is NOT a biotic factor of an ecosystem?",
        "a": "parasite", "b": "predator", "c": "herbivore/grazer", "d": "atmospheric pressure",
        "ans": 3,
        "exp": "Atmospheric pressure is an abiotic (non-living physical) factor, whereas parasites, predators, and grazers are living biotic components.",
        "topic": "Ecology & Ecosystems"
    },
    {
        "id": "geo_2015_43",
        "q": "Water pollution in inland drainage systems is caused by all the following EXCEPT",
        "a": "increased silt load from soil erosion", "b": "untreated domestic sewage discharge", "c": "protective sand filling/embankment", "d": "toxic industrial effluents",
        "ans": 2,
        "exp": "Controlled sand filling or embankment construction along riverbanks is a civil engineering measure and not a direct chemical/biological water pollutant.",
        "topic": "Environmental Pollution"
    },
    {
        "id": "geo_2015_44",
        "q": "Which of the following represents the correct sequential order in which denudation processes occur?",
        "a": "Weathering -> Deposition -> Erosion", "b": "Weathering -> Erosion -> Deposition", "c": "Erosion -> Weathering -> Deposition", "d": "Deposition -> Erosion -> Weathering",
        "ans": 1,
        "exp": "Rocks first break down in situ by weathering; loosened materials are then transported by agents of erosion and finally laid down in deposition.",
        "topic": "Denudation"
    },
    {
        "id": "geo_2015_45",
        "q": "Because the earth is slightly flattened at the poles and bulges at the equator, its true three-dimensional shape is best described as an",
        "a": "oblate spheroid (geoid)", "b": "exact sphere", "c": "elliptical cylinder", "d": "irregular flat plane",
        "ans": 0,
        "exp": "Due to centrifugal forces of its rotation, the Earth is an oblate spheroid (or geoid) with an equatorial diameter 43 km greater than its polar diameter.",
        "topic": "Shape and Size of the Earth"
    },
    {
        "id": "geo_2015_46",
        "q": "The following are abiotic components of an ecosystem EXCEPT",
        "a": "bacteria and fungi", "b": "topography", "c": "water", "d": "wind",
        "ans": 0,
        "exp": "Bacteria and fungi are living microorganisms (decomposers/biotic components), while topography, water, and wind are abiotic factors.",
        "topic": "Ecosystem Components"
    },
    {
        "id": "geo_2015_47",
        "q": "Which of the following agricultural practices has a beneficial effect in maintaining soil structure and fertility?",
        "a": "overgrazing", "b": "strip cultivation and crop rotation", "c": "bush burning", "d": "continuous mono-cropping",
        "ans": 1,
        "exp": "Strip cultivation and crop rotation alternate soil nutrient demands, reduce surface runoff, and control soil erosion.",
        "topic": "Soil Conservation"
    },
    {
        "id": "geo_2015_48",
        "q": "The concentration of dissolved salts in ocean water is referred to as",
        "a": "ocean depth", "b": "turbidity", "c": "deep sea hydrostatic pressure", "d": "ocean salinity",
        "ans": 3,
        "exp": "Ocean salinity is the total amount of dissolved salts in seawater, typically averaging about 35 parts per thousand (35‰).",
        "topic": "Oceans and Seas"
    },
    {
        "id": "geo_2015_49",
        "q": "Rocks formed in distinct layered strata separated by bedding planes are called",
        "a": "metamorphic rocks", "b": "plutonic rocks", "c": "volcanic igneous rocks", "d": "sedimentary rocks",
        "ans": 3,
        "exp": "Sedimentary rocks (stratified rocks) are formed by the deposition and consolidation of mineral and organic particles in successive layers.",
        "topic": "Rocks & Minerals"
    },
    {
        "id": "geo_2015_50",
        "q": "Which of the following physical properties is NOT used in the textural definition of soil classification?",
        "a": "color", "b": "soil water retention capacity", "c": "permeability", "d": "soil texture (sand, silt, clay ratio)",
        "ans": 1,
        "exp": "Soil texture is strictly defined by the relative proportions of sand, silt, and clay particles, not by secondary water retention properties.",
        "topic": "Soil Science"
    },
    {
        "id": "geo_2015_51",
        "q": "The narrow global zone of air, land, and water capable of supporting life is referred to as the",
        "a": "biosphere", "b": "lithosphere", "c": "hydrosphere", "d": "atmosphere",
        "ans": 0,
        "exp": "The biosphere is the global ecological system integrating all living beings and their relationships with the lithosphere, hydrosphere, and atmosphere.",
        "topic": "The Biosphere"
    },
    {
        "id": "geo_2015_52",
        "q": "Geographically, Nigeria is situated in",
        "a": "East Africa", "b": "North Africa", "c": "West Africa", "d": "Southern Africa",
        "ans": 2,
        "exp": "Nigeria is located on the Gulf of Guinea in West Africa, bordered by Benin, Niger, Chad, and Cameroon.",
        "topic": "Geography of Nigeria"
    },
    {
        "id": "geo_2015_53",
        "q": "Which mode of modern transportation is most severely affected by adverse weather conditions like dense fog and turbulence?",
        "a": "railway transport", "b": "water transport", "c": "pipeline transport", "d": "air transport",
        "ans": 3,
        "exp": "Air transport requires clear visibility for take-off and landing and is most sensitive to low clouds, dense fog, thunderstorms, and atmospheric turbulence.",
        "topic": "Transportation & Communication"
    },
    {
        "id": "geo_2015_54",
        "q": "A great circle on the terrestrial globe is best described as",
        "a": "any circle whose plane passes through the exact centre of the globe", "b": "any parallel of latitude", "c": "the Tropic of Cancer", "d": "a small circle parallel to the equator",
        "ans": 0,
        "exp": "A great circle is the largest circle that can be drawn on a sphere, dividing the sphere into two equal hemispheres (e.g., the Equator and all Meridian pairs).",
        "topic": "Great Circles and Small Circles"
    },
    {
        "id": "geo_2015_55",
        "q": "Major seismic activity occurs along tectonic plate boundaries because of",
        "a": "isostatic adjustment and fault slip", "b": "lunar gravitational pulls only", "c": "ocean tidal variations", "d": "atmospheric pressure drops",
        "ans": 0,
        "exp": "Earthquakes occur when stress built up along tectonic fault planes overcomes frictional resistance, releasing energy in seismic waves.",
        "topic": "Earthquakes and Faulting"
    },
    {
        "id": "geo_2015_56",
        "q": "The longitudinal extent of Nigeria between its western and eastern borders is approximately",
        "a": "5°", "b": "12° (from 3°E to 15°E)", "c": "25°", "d": "35°",
        "ans": 1,
        "exp": "Nigeria extends longitudinally from approximately 2°49'E (approx 3°E) to 14°38'E (approx 15°E), giving an extent of 15° - 3° = 12°.",
        "topic": "Location and Position of Nigeria"
    },
    {
        "id": "geo_2015_57",
        "q": "The liquid water portion of the earth including oceans, seas, rivers, lakes, and underground aquifers is the",
        "a": "biosphere", "b": "hydrosphere", "c": "mesosphere", "d": "lithosphere",
        "ans": 1,
        "exp": "The hydrosphere encompasses all the water on the earth's surface, underground, and in the atmosphere.",
        "topic": "Structure of the Earth"
    },
    {
        "id": "geo_2015_58",
        "q": "In which of the following climatic zones is Mediterranean citrus and fruit farming least developed?",
        "a": "Northern Morocco", "b": "Nile Delta (Egypt)", "c": "Coastal Algeria", "d": "Uganda (Equatorial East Africa)",
        "ans": 3,
        "exp": "Mediterranean fruit farming thrives in warm, dry summers and mild, wet winters (e.g. Morocco, Algeria), whereas Uganda has an equatorial climate.",
        "topic": "World Agricultural Regions"
    },
    {
        "id": "geo_2015_59",
        "q": "An artificial waterway that connects the Mediterranean Sea to the Red Sea, facilitating international maritime trade, is the",
        "a": "Suez Canal", "b": "Panama Canal", "c": "Kiel Canal", "d": "Erie Canal",
        "ans": 0,
        "exp": "The Suez Canal in Egypt connects the Mediterranean Sea to the Red Sea, eliminating the need for ships to navigate around the Cape of Good Hope.",
        "topic": "World Trade Routes & Canals"
    },
    {
        "id": "geo_2015_60",
        "q": "The most highly urbanized geopolitical zone in Nigeria, with the highest concentration of major cities, is the",
        "a": "North-Central zone", "b": "North-East zone", "c": "South-West zone (Lagos, Ibadan, Abeokuta, Akure)", "d": "North-West zone",
        "ans": 2,
        "exp": "The South-West zone of Nigeria has historically had the highest rate of urbanization in tropical Africa with extensive metropolitan networks.",
        "topic": "Settlement & Urbanization in Nigeria"
    },
    {
        "id": "geo_2015_61",
        "q": "All the following are characteristic hydrological features of Nigerian rivers EXCEPT",
        "a": "marked seasonal variations in volume (floods during rainy season)", "b": "presence of rapids and waterfalls that interrupt continuous navigation", "c": "high silt loads during peak discharge", "d": "tidal bores occurring on inland headwaters",
        "ans": 3,
        "exp": "Nigerian rivers suffer from seasonal flow variation, rapids, and siltation, but tidal bores are oceanic mouth phenomena not found in inland headwaters.",
        "topic": "Drainage & Hydrology of Nigeria"
    },
    {
        "id": "geo_2015_62",
        "q": "Commercial monoculture involving large-scale cultivation of a single cash crop on extensive estates is known as",
        "a": "rotational bush farming", "b": "terrace farming", "c": "plantation agriculture", "d": "mixed farming",
        "ans": 2,
        "exp": "Plantation agriculture is characterized by large estates, foreign or corporate capital, specialized monoculture, and production for export.",
        "topic": "Agricultural Systems"
    },
    {
        "id": "geo_2015_63",
        "q": "Plants with specialized structural adaptations to survive in drought and arid environments are called",
        "a": "hydrophytes", "b": "mesophytes", "c": "xerophytes", "d": "epiphytes",
        "ans": 2,
        "exp": "Xerophytes (e.g., cacti, baobab, acacia) have thick cuticles, sunken stomata, succulent stems, and deep roots to withstand prolonged water deficits.",
        "topic": "Vegetation Adaptations"
    },
    {
        "id": "geo_2015_64",
        "q": "Extremely low annual rainfall, sparse thorny vegetation, high diurnal temperature ranges, and cold nights are characteristic of the",
        "a": "mangrove swamp", "b": "tropical rainforest", "c": "Guinea savanna", "d": "hot desert (Sahara)",
        "ans": 3,
        "exp": "Hot deserts experience less than 250 mm of annual rainfall, high daytime solar radiation, and rapid nocturnal radiative cooling.",
        "topic": "World Climates: Deserts"
    },
    {
        "id": "geo_2015_65",
        "q": "The rapid downward sliding of large masses of bedrock and debris along a shear surface on steep slopes is called a",
        "a": "soil creep", "b": "landslide", "c": "solifluction", "d": "talus slope",
        "ans": 1,
        "exp": "A landslide is a rapid mass movement of rock, debris, or earth down a slope under gravitational stress.",
        "topic": "Mass Wasting"
    },
    {
        "id": "geo_2015_66",
        "q": "The industrial technique used to extract crude petroleum oil from underground geological formations is the",
        "a": "open-cast mining method", "b": "shaft mining method", "c": "placer washing method", "d": "drilling method",
        "ans": 3,
        "exp": "Petroleum is extracted by drilling deep wells into permeable sedimentary reservoir rocks using rotary drilling rigs.",
        "topic": "Mining in Nigeria"
    },
    {
        "id": "geo_2015_67",
        "q": "The meteorological instrument used to measure the amount of precipitation in millimetres over a given period is the",
        "a": "rain gauge", "b": "maximum-minimum thermometer", "c": "hygrometer", "d": "aneroid barometer",
        "ans": 0,
        "exp": "A rain gauge consists of a funnel and measuring cylinder used to collect and record rainfall depth in millimetres.",
        "topic": "Weather Instruments"
    },
    {
        "id": "geo_2015_68",
        "q": "The primary natural factors that determine the climax vegetation a habitat can support include all EXCEPT",
        "a": "annual rainfall and temperature regime", "b": "nature and depth of soil particles", "c": "depth of the water table", "d": "artificial crop spraying schedules",
        "ans": 3,
        "exp": "Climax natural vegetation is determined by climate (rainfall, temperature) and edaphic factors (soil, water table), not artificial farm spraying schedules.",
        "topic": "Vegetation and Biomes"
    },
    {
        "id": "geo_2015_69",
        "q": "A collective geographic term for natural flowing and standing surface water bodies like streams, rivers, and lakes is",
        "a": "canal", "b": "ditch", "c": "drainage system", "d": "ocean trench",
        "ans": 2,
        "exp": "The term drainage system refers to the natural river basins, tributaries, lakes, and channels that drain a geographical region.",
        "topic": "Drainage Systems"
    },
    {
        "id": "geo_2015_70",
        "q": "All the following are major tropical timber-producing countries in Africa EXCEPT",
        "a": "Ghana", "b": "Côte d'Ivoire", "c": "Nigeria", "d": "Mauritania",
        "ans": 3,
        "exp": "Mauritania is an arid Sahelian/Saharan country with virtually no dense tropical forest cover, whereas Ghana, Côte d'Ivoire, and Nigeria produce tropical hardwood timber.",
        "topic": "Lumbering in Africa"
    },
    {
        "id": "geo_2015_71",
        "q": "All of these are characteristic landforms of the lower course of a river EXCEPT",
        "a": "flood plain", "b": "V-shaped valley with interlocking spurs", "c": "natural levees", "d": "ox-bow lake",
        "ans": 1,
        "exp": "V-shaped valleys with interlocking spurs are formed by vertical downcutting in the upper (youthful) course of a river, whereas floodplains, levees, and ox-bow lakes occur in the lower (mature) course.",
        "topic": "River Action & Landforms"
    },
    {
        "id": "geo_2015_72",
        "q": "The underground point within the earth's crust where seismic energy is first released in an earthquake is called the",
        "a": "focus (hypocentre)", "b": "epicentre", "c": "caldera", "d": "crater",
        "ans": 0,
        "exp": "The focus (or hypocentre) is the point of origin inside the earth; the point directly above it on the surface is the epicentre.",
        "topic": "Earthquakes"
    },
    {
        "id": "geo_2015_73",
        "q": "The total number of people inhabiting a specific land area per square kilometre is referred to as population",
        "a": "density", "b": "dominance", "c": "coverage", "d": "structure",
        "ans": 0,
        "exp": "Population density is expressed as the number of persons living per unit of land area (e.g., persons per km²).",
        "topic": "Population Density"
    },
    {
        "id": "geo_2015_74",
        "q": "A natural outflow of groundwater emerging onto the earth's surface from an aquifer is called a",
        "a": "stream sink", "b": "rain squall", "c": "spring", "d": "river delta",
        "ans": 2,
        "exp": "A spring is a natural discharge point where the water table intersects the ground surface.",
        "topic": "Underground Water"
    },
    {
        "id": "geo_2015_75",
        "q": "Loam is considered the ideal soil type for agricultural crop production primarily because",
        "a": "it contains excessive clay preventing all drainage", "b": "it contains a balanced mixture of sand, silt, clay, and high humus content with good water retention and aeration", "c": "it lacks organic matter entirely", "d": "it consists solely of coarse gravel",
        "ans": 1,
        "exp": "Loam contains balanced proportions of sand (aeration), silt, and clay (nutrient/water retention) enriched with decomposed organic matter (humus).",
        "topic": "Soils & Agriculture"
    },
    {
        "id": "geo_2015_76",
        "q": "Which of the following inner terrestrial planets has no natural satellite?",
        "a": "Venus", "b": "Mars", "c": "Uranus", "d": "Neptune",
        "ans": 0,
        "exp": "Both Mercury and Venus have no natural satellites (moons). Earth has one moon, and Mars has two (Phobos and Deimos).",
        "topic": "The Solar System"
    },
    {
        "id": "geo_2015_77",
        "q": "When it is 9:00 am in Munich (longitude 11°E), what is the local standard time in Calcutta, India (longitude 96°E)?",
        "a": "4:20 am", "b": "2:40 am", "c": "2:40 pm", "d": "5:40 pm",
        "ans": 2,
        "exp": "Longitudinal difference = 96°E - 11°E = 85° East. Time difference = 85° / 15° = 5 hours and 40 minutes ahead. 9:00 am + 5 hrs 40 mins = 2:40 pm.",
        "topic": "Longitude and Time Calculations"
    },
    {
        "id": "geo_2015_78",
        "q": "Which of the following statements is scientifically INCORRECT regarding the solar system?",
        "a": "the sun provides the primary thermal and light energy for the system", "b": "planets remain stationary while the sun rotates around them", "c": "planets revolve around the sun in elliptical orbits", "d": "the sun is located at the center of the solar system",
        "ans": 1,
        "exp": "Planets revolve around the central Sun in heliocentric orbits; they are not stationary.",
        "topic": "The Solar System"
    },
    {
        "id": "geo_2015_79",
        "q": "The spinning movement of the Earth on its own axis from West to East every 24 hours is called",
        "a": "friction", "b": "revolution", "c": "gravitation", "d": "rotation",
        "ans": 3,
        "exp": "Rotation is the spinning of the Earth on its axis from West to East causing the alternation of day and night.",
        "topic": "Earth Movements: Rotation"
    },
    {
        "id": "geo_2015_80",
        "q": "Which of the following meteorological instruments is used to measure wind speed?",
        "a": "thermometer", "b": "barometer", "c": "hygrometer", "d": "anemometer",
        "ans": 3,
        "exp": "An anemometer (commonly cup anemometer) measures wind velocity/speed, while a wind vane determines wind direction.",
        "topic": "Weather Instruments"
    },
    {
        "id": "geo_2015_81",
        "q": "All the following are examples of urban settlements EXCEPT",
        "a": "towns", "b": "nucleated rural village", "c": "conurbation", "d": "megalopolis",
        "ans": 1,
        "exp": "A village is a rural settlement dominated by primary economic activities (farming, fishing), whereas towns, conurbations, and megalopolises are urban.",
        "topic": "Settlement Geography"
    }
]

print(f"Parsed {len(geo_questions)} Geography questions.")
