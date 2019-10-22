package com.app.book;
/*
 *   作者：NewManWatch
 *   时间：2019-10-22 22:34:38
 *   目的： 1测试构造方法对数据的初始化
 *         2测试Book toString方法的复写
 *
 * */

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
