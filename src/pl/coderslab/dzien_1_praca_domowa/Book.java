package pl.coderslab.dzien_1_praca_domowa;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    private Author autor;
    private Author[] additionalAuthors;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public Author getAutor() {
        return autor;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, Author autor) {
        this.id = id;
        this.title = title;
        this.autor = autor;
    }

    public Book(int id, String title, Author autor, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.additionalAuthors = additionalAuthors;
    }
}
