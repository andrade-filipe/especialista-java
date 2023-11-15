package core.animal.entitys;

import core.animal.entitys.enums.Sex;

import java.time.OffsetDateTime;

public class Animal {
    private final String name;
    private final String raca;
    private final Sex sex;
    private final OffsetDateTime birth;

    public Animal(String name, String raca, Sex sex, OffsetDateTime birth) {
        this.name = name;
        this.raca = raca;
        this.sex = sex;
        this.birth = birth;
    }

    private int age() {
        int compareMonth = OffsetDateTime.now().getMonth().compareTo(birth.getMonth());
        int age = OffsetDateTime.now().getYear() - birth.getYear();

        boolean dayIsYetToCome = OffsetDateTime.now().getDayOfMonth() < birth.getDayOfMonth();
        boolean monthIsYetToCome = compareMonth < 0;
        boolean monthOfTheBirthDay = compareMonth == 0;


        if (monthIsYetToCome) {
            return age - 1;
        } else if (monthOfTheBirthDay) {
            if (dayIsYetToCome) {
                return age - 1;
            }
        }
        return age;
    }

    public void printAnimalInfo() {
        System.out.println("Nome: " + this.name);
        System.out.println("Raça: " + this.raca);
        System.out.println("Sexo: " + this.sex);
        System.out.println("Idade: " + this.age());
        System.out.println("**********************");
    }
}
