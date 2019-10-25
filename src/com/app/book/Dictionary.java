package com.app.book;
/*
 *   作者：NewManWatch
 *   时间：2019-10-22 22:34:38
 *   目的： 1测试构造方法对数据的初始化
 *         2测试继承
 *         3测试Dictionary对其父类的getset方法复写以及toString方法的复写
 *
 * */

public class Dictionary extends Book {
    private int auxiliaryDictionaryPage;
    public Dictionary(String bookId,String bookName ,int bookPage,int auxiliaryDictionaryPage){
        super(bookId, bookName, bookPage);
        setAuxiliaryDictionaryPage(auxiliaryDictionaryPage);
    }
    public int getAuxiliaryDictionaryPage() {
        return auxiliaryDictionaryPage;
    }

    public void setAuxiliaryDictionaryPage(int auxiliaryDictionaryPage) {
        this.auxiliaryDictionaryPage = auxiliaryDictionaryPage;
    }

    @Override
    public String getBookId() {
        return  TheConstantOfString.DICTIONARY_HEAD + super.getBookId();
    }

    @Override
    public String toString() {
        return  getBookId() +"  "+ getBookName()+"  " + getBookPage() +"  " + this.getAuxiliaryDictionaryPage();
    }
}
