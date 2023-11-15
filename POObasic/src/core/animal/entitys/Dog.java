package core.animal.entitys;

import core.animal.entitys.enums.Sex;

import java.time.OffsetDateTime;

public class Dog extends Animal {
    public Dog(String name, String raca, Sex sex, OffsetDateTime birth) {
        super(name, raca, sex, birth);
    }
}
