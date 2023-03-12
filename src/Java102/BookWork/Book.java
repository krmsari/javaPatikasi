package Java102.BookWork;

import java.util.Date;

public class Book implements Comparable<Book> {
    private String name;
    private Integer numPage;
    private String writer;
    private Integer date;

    public Book(String name, Integer numPage, String writer, Integer date) {
        this.name = name;
        this.numPage = numPage;
        this.writer = writer;
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPage(Integer numPage) {
        this.numPage = numPage;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Integer getNumPage() {
        return numPage;
    }

    public String getWriter() {
        return writer;
    }

    public Integer getDate() {
        return date;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
