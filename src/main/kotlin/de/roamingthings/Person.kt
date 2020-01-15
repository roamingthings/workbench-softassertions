package de.roamingthings

data class Person(
    val haare: String,
    val kopf: String,
    val augen: String,
    val halsschmuck: Int,
    val arme: Int,
    val finger: Int = 10,
    val kleidung: BekleidungsArt,
    val beine: String,
    val fuesse: String = "Standard"
)

enum class BekleidungsArt {
    STANDARD, FANCY
}
