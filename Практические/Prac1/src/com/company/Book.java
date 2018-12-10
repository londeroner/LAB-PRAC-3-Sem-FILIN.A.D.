package com.company;

public class Book {
    private int pageCount;
    private String genre;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book()
    {
        genre = "unknown";
        pageCount = 0;
    }

    public Book(int pageCount)
    {
        this.pageCount = pageCount;
        genre = "unknown";
    }

    public Book(String genre)
    {
        this.genre = genre;
        pageCount = 0;
    }

    public Book(int pageCount, String genre)
    {
        this.pageCount = pageCount;
        this.genre = genre;
    }

    @Override public String toString()
    {
        return "Жанр: " + genre + "\nКоличество страниц: " + pageCount;
    }
}
