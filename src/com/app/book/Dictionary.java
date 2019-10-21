package com.app.book;

public class Dictionary extends Book {
    private int auxiliaryDictionaryPage;
    public Dictionary(String bookId,String bookName ,int bookPage,int auxiliaryDictionaryPage){
        super(bookId, bookName, bookPage);
    }
    public int getAuxiliaryDictionaryPage() {
        return auxiliaryDictionaryPage;
    }

    public void setAuxiliaryDictionaryPage(int auxiliaryDictionaryPage) {
        this.auxiliaryDictionaryPage = auxiliaryDictionaryPage;
    }

    @Override
    public String getBookId() {
        return "D001" + super.getBookId();
    }

    @Override
    public String toString() {
        return super.toString() + this.getAuxiliaryDictionaryPage();
    }
}
