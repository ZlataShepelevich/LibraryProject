package org.libraryproject.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Min;

public class Person {
    private int person_id;

    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+ [А-Я][а-я]+", message = "Ваше имя должно быть в таком формате: Фамилия Имя Отчество")
    private String name;

    @Min(value = 1900, message = "Год рождения должен быть больше 1990")
    private int birthYear;

    public Person(){}

    public Person(int id, String name, int birthYear) {
        this.person_id = id;
        this.name = name;
        this.birthYear = birthYear;

    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}


