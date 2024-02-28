public class Book {
    String name;
    Author author;
    int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return this.name;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
