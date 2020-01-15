package de.roamingthings;

public class FancyPersonMapperTestData {
    static final String HAARE = "Standard";
    static final String KOPF = "Standard";
    static final String AUGEN = "Standard";
    static final Integer HALSSCHMUCK = 1;
    static final Integer ARME = 2;
    static final Integer FINGER = 10;
    static final BekleidungsArt KLEIDUNG = BekleidungsArt.STANDARD;
    static final String BEINE = "Standard";
    static final String FUESSE = "Standard";

    static Person aPerson() {
        return new Person(
                HAARE,
                KOPF,
                AUGEN,
                HALSSCHMUCK,
                ARME,
                FINGER,
                KLEIDUNG,
                BEINE,
                FUESSE
        );
    }
}
