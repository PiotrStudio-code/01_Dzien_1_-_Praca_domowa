package pl.coderslab.dzien_3;

public class Person {
    private String name = "Imie";
    private String surname = "Najzwisko";
    private int age = 21;
    private char gender = '!';

    void setName(String name1)
    {
        name = name1;
    }

    void setSurname(String surname1)
    {
        surname = surname1;
    }
    void setAge(int age1)
    {
        age = age1;
    }

    void setGender(char gender1)
    {
        gender = gender1;
    }

    String getFullName()
    {
        return name + " " + surname;
    }

    void increaseAge()
    {
        age++;
    }


}
