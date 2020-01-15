package de.roamingthings

import de.roamingthings.BekleidungsArt.FANCY

fun mapToFancy(person: Person) =
    person.copy(
        halsschmuck = 3,
        haare = "fancy",
        kleidung = FANCY
    )
