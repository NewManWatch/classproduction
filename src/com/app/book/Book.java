package com.app.book;

public class Book {
    private String bookId;
    private String bookName;
    private int    bookPage;
    public  Book ( String bookId,String bookName ,int bookPage){
        setBookId(bookId);
        setBookName(bookName);
        setBookPage(bookPage);

    }


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    @Override
    public String toString() {
        return this.bookId +"  "+ this.bookName+"  " + this.bookPage;
    }
}
