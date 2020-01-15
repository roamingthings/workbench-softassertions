package de.roamingthings;

import org.junit.jupiter.api.Test;

import static de.roamingthings.BekleidungsArt.FANCY;
import static de.roamingthings.FancyPersonMapperV2.mapToFancy;
import static de.roamingthings.FancyPersonMapperTestData.*;
import static org.assertj.core.api.Assertions.assertThat;

class FancyPersonMapperV2Test {

    @Test
    void mapper_v2_should_map_to_fancy_person() {
        Person person = aPerson();

        Person fancyPerson = mapToFancy(person);

        assertThat(fancyPerson.getHaare()).isEqualTo("fancy");
        assertThat(fancyPerson.getKopf()).isEqualTo(KOPF);
        assertThat(fancyPerson.getAugen()).isEqualTo(AUGEN);
        assertThat(fancyPerson.getHalsschmuck()).isEqualTo(3);
        assertThat(fancyPerson.getArme()).isEqualTo(ARME);
        assertThat(fancyPerson.getFinger()).isEqualTo(FINGER);
        assertThat(fancyPerson.getKleidung()).isEqualTo(FANCY);
        assertThat(fancyPerson.getBeine()).isEqualTo(BEINE);
        assertThat(fancyPerson.getFuesse()).isEqualTo(FUESSE);
    }
}
