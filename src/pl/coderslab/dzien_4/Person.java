package pl.coderslab.dzien_4;

public class Person {
    private String name;
    private String surname = "Najzwisko";
    private int age = 21;
    private char gender = '!';

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
