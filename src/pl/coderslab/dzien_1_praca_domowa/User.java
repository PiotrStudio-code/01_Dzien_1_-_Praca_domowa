package pl.coderslab.dzien_1_praca_domowa;

import java.util.ArrayList;
import java.util.List;


public class User {
   private int id;
   private String firstName;
   private String  lastName;
   private List<Book> books = new ArrayList<>();

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void addBook(Book book)
    {
        books.add(book);
    }

    void changeBooksLength(int length)
    {
        List<Book> tempBook = new ArrayList<Book>();
        for(int i=0;i<length;i++) {
            tempBook.add(null);
        }
        books = tempBook;
    }
}
