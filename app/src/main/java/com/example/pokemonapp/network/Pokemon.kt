package com.example.pokemonapp.network

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

@Serializable
data class Pokemon (
    val abilities: List<Ability>? = null,

    @SerialName("base_experience")
    val baseExperience: Long? = null,

    val cries: Cries? = null,
    val forms: List<Species>? = null,

    @SerialName("game_indices")
    val gameIndices: List<GameIndex>? = null,

    val height: Long? = null,

    @SerialName("held_items")
    val heldItems: JsonArray? = null,

    val id: Long? = null,

    @SerialName("is_default")
    val isDefault: Boolean? = null,

    @SerialName("location_area_encounters")
    val locationAreaEncounters: String? = null,

    val moves: List<Move>? = null,
    val name: String? = null,
    val order: Long? = null,

    @SerialName("past_abilities")
    val pastAbilities: JsonArray? = null,

    @SerialName("past_types")
    val pastTypes: JsonArray? = null,

    val species: Species? = null,
    val sprites: Sprites? = null,
    val stats: List<Stat>? = null,
    val types: List<Type>? = null,
    val weight: Long? = null
)

@Serializable
data class Ability (
    val ability: Species? = null,

    @SerialName("is_hidden")
    val isHidden: Boolean? = null,

    val slot: Long? = null
)

@Serializable
data class Species (
    val name: String? = null,
    val url: String? = null
)

@Serializable
data class Cries (
    val latest: String? = null,
    val legacy: String? = null
)

@Serializable
data class GameIndex (
    @SerialName("game_index")
    val gameIndex: Long? = null,

    val version: Species? = null
)

@Serializable
data class Move (
    val move: Species? = null,

    @SerialName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>? = null
)

@Serializable
data class VersionGroupDetail (
    @SerialName("level_learned_at")
    val levelLearnedAt: Long? = null,

    @SerialName("move_learn_method")
    val moveLearnMethod: Species? = null,

    @SerialName("version_group")
    val versionGroup: Species? = null
)

@Serializable
data class GenerationV (
    @SerialName("black-white")
    val blackWhite: Sprites? = null
)

@Serializable
data class GenerationIv (
    @SerialName("diamond-pearl")
    val diamondPearl: Sprites? = null,

    @SerialName("heartgold-soulsilver")
    val heartgoldSoulsilver: Sprites? = null,

    val platinum: Sprites? = null
)

@Serializable
data class Versions (
    @SerialName("generation-i")
    val generationI: GenerationI? = null,

    @SerialName("generation-ii")
    val generationIi: GenerationIi? = null,

    @SerialName("generation-iii")
    val generationIii: GenerationIii? = null,

    @SerialName("generation-iv")
    val generationIv: GenerationIv? = null,

    @SerialName("generation-v")
    val generationV: GenerationV? = null,

    @SerialName("generation-vi")
    val generationVi: Map<String, Home>? = null,

    @SerialName("generation-vii")
    val generationVii: GenerationVii? = null,

    @SerialName("generation-viii")
    val generationViii: GenerationViii? = null
)

@Serializable
data class Other (
    @SerialName("dream_world")
    val dreamWorld: DreamWorld? = null,

    val home: Home? = null,

    @SerialName("official-artwork")
    val officialArtwork: OfficialArtwork? = null,

    val showdown: Sprites? = null
)

@Serializable
data class Sprites (
    @SerialName("back_default")
    val backDefault: String? = null,

    @SerialName("back_female")
    val backFemale: JsonElement? = null,

    @SerialName("back_shiny")
    val backShiny: String? = null,

    @SerialName("back_shiny_female")
    val backShinyFemale: JsonElement? = null,

    @SerialName("front_default")
    val frontDefault: String? = null,

    @SerialName("front_female")
    val frontFemale: JsonElement? = null,

    @SerialName("front_shiny")
    val frontShiny: String? = null,

    @SerialName("front_shiny_female")
    val frontShinyFemale: JsonElement? = null,

    val other: Other? = null,
    val versions: Versions? = null,
    val animated: Sprites? = null
)

@Serializable
data class GenerationI (
    @SerialName("red-blue")
    val redBlue: RedBlue? = null,

    val yellow: RedBlue? = null
)

@Serializable
data class RedBlue (
    @SerialName("back_default")
    val backDefault: String? = null,

    @SerialName("back_gray")
    val backGray: String? = null,

    @SerialName("back_transparent")
    val backTransparent: String? = null,

    @SerialName("front_default")
    val frontDefault: String? = null,

    @SerialName("front_gray")
    val frontGray: String? = null,

    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class GenerationIi (
    val crystal: Crystal? = null,
    val gold: Gold? = null,
    val silver: Gold? = null
)

@Serializable
data class Crystal (
    @SerialName("back_default")
    val backDefault: String? = null,

    @SerialName("back_shiny")
    val backShiny: String? = null,

    @SerialName("back_shiny_transparent")
    val backShinyTransparent: String? = null,

    @SerialName("back_transparent")
    val backTransparent: String? = null,

    @SerialName("front_default")
    val frontDefault: String? = null,

    @SerialName("front_shiny")
    val frontShiny: String? = null,

    @SerialName("front_shiny_transparent")
    val frontShinyTransparent: String? = null,

    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class Gold (
    @SerialName("back_default")
    val backDefault: String? = null,

    @SerialName("back_shiny")
    val backShiny: String? = null,

    @SerialName("front_default")
    val frontDefault: String? = null,

    @SerialName("front_shiny")
    val frontShiny: String? = null,

    @SerialName("front_transparent")
    val frontTransparent: String? = null
)

@Serializable
data class GenerationIii (
    val emerald: OfficialArtwork? = null,

    @SerialName("firered-leafgreen")
    val fireredLeafgreen: Gold? = null,

    @SerialName("ruby-sapphire")
    val rubySapphire: Gold? = null
)

@Serializable
data class OfficialArtwork (
    @SerialName("front_default")
    val frontDefault: String? = null,

    @SerialName("front_shiny")
    val frontShiny: String? = null
)

@Serializable
data class Home (
    @SerialName("front_default")
    val frontDefault: String? = null,

    @SerialName("front_female")
    val frontFemale: JsonElement? = null,

    @SerialName("front_shiny")
    val frontShiny: String? = null,

    @SerialName("front_shiny_female")
    val frontShinyFemale: JsonElement? = null
)

@Serializable
data class GenerationVii (
    val icons: DreamWorld? = null,

    @SerialName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: Home? = null
)

@Serializable
data class DreamWorld (
    @SerialName("front_default")
    val frontDefault: String? = null,

    @SerialName("front_female")
    val frontFemale: JsonElement? = null
)

@Serializable
data class GenerationViii (
    val icons: DreamWorld? = null
)

@Serializable
data class Stat (
    @SerialName("base_stat")
    val baseStat: Long? = null,

    val effort: Long? = null,
    val stat: Species? = null
)

@Serializable
data class Type (
    val slot: Long? = null,
    val type: Species? = null
)
