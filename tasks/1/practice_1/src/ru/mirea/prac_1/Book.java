package ru.mirea.prac_1;

public class Book {
    private String title;
    private String coverType;

    public Book(String title, String coverType) {
        this.title = title;
        this.coverType = coverType;
    }

    public String getTitle() {
        return title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public void sayTitle() {
        System.out.println("My title: " + title);
    }

    @Override
    public String toString() {
        return "ru.mirea.prac_1.Book{" +
                "title='" + title + '\'' +
                ", coverType='" + coverType + '\'' +
                '}';
    }
}
