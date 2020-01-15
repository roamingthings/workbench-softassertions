package de.roamingthings;

import java.lang.reflect.Field;
import java.util.Optional;
import java.util.stream.Stream;

import static de.roamingthings.BekleidungsArt.FANCY;

public class FancyPersonMapperV2 {
    static Person mapToFancy(Person person) {
        try {
            Field[] fields = Person.class.getDeclaredFields();
            Optional<Field> bekleidung = Stream.of(fields)
                    .filter(field -> field.getType().equals(BekleidungsArt.class))
                    .findFirst();
            if (bekleidung.isPresent()) {
                bekleidung.get().setAccessible(true);
                bekleidung.get().set(person, FANCY);
            }
            fields[4].setAccessible(true);
            fields[4].set(person, 3);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        return person;
    }
}
