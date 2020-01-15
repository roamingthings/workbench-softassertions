package de.roamingthings;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static de.roamingthings.BekleidungsArt.FANCY;
import static de.roamingthings.FancyPersonMapperTestData.*;
import static de.roamingthings.FancyPersonMapperV2.mapToFancy;

class FancyPersonMapperV2Test {

    @Test
    void mapper_v2_should_map_to_fancy_person() {
        Person person = aPerson();

        Person fancyPerson = mapToFancy(person);

        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(fancyPerson.getHaare()).isEqualTo("fancy");
            softly.assertThat(fancyPerson.getKopf()).isEqualTo(KOPF);
            softly.assertThat(fancyPerson.getAugen()).isEqualTo(AUGEN);
            softly.assertThat(fancyPerson.getHalsschmuck()).isEqualTo(3);
            softly.assertThat(fancyPerson.getArme()).isEqualTo(ARME);
            softly.assertThat(fancyPerson.getFinger()).isEqualTo(FINGER);
            softly.assertThat(fancyPerson.getKleidung()).isEqualTo(FANCY);
            softly.assertThat(fancyPerson.getBeine()).isEqualTo(BEINE);
            softly.assertThat(fancyPerson.getFuesse()).isEqualTo(FUESSE);
        });
    }
}
