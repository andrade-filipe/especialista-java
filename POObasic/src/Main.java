import core.animal.entitys.Dog;
import core.animal.entitys.enums.Sex;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        Dog sherlock = new Dog(
                "Sherlock",
                "Siberian Husky",
                Sex.MALE,
                OffsetDateTime.of(
                        2020, 6, 20,
                        0, 0, 0, 0, ZoneOffset.UTC));

        Dog sophie = new Dog(
                "Sophie",
                "Pinscher",
                Sex.FEMALE,
                OffsetDateTime.of(
                        2016, 12, 15,
                        0, 0, 0, 0, ZoneOffset.UTC));

        sherlock.printAnimalInfo();
        sophie.printAnimalInfo();
    }
}