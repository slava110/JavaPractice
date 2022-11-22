package lab_2_3;

public class Book {
    private String author;
    private String title;
    private String releaseDate;
    private boolean isCool;

    public Book(String author, String title, String releaseDate, boolean isCool) {
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
        this.isCool = isCool;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isCool() {
        return isCool;
    }

    public void setCool(boolean cool) {
        isCool = cool;
    }
}
