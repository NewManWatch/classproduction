package com.app.book;
/*
*   作者：NewManWatch
*   时间：2019-10-22 22:34:38
*   目的： 1测试构造方法对数据的初始化
*         2测试Book与其子类的getset方法复写以及toString方法的复写
*
* */
public class main {
    public static final void main(String[] args){
        Book book =new Book("IMB001","test",90);
        System.out.print(book.toString()+"\n");
        Dictionary dictionary = new Dictionary("M001","testd",46,21);
        System.out.print(dictionary.toString());
    }
}
