package pl.coderslab.dzien_2;

public class Main03 {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Imie: " + person.name);
        System.out.println("Nazwisko: " + person.surname);
        System.out.println("Wiek: " + person.age);
        System.out.println("Płeć: " + person.gender);
    }

}

class Person {
    public String name = "Imie";
    public String surname = "Najzwisko";
    public int age = 21;
    public char gender = '!';

}

