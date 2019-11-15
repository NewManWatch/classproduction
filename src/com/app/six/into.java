package com.app.six;

public class into {
    public static void main(String[] args){
        Book book1 = new Book("dsd",243,234);
        Book book2 = new Periodical("dewfsd",243,234,"HJKHKJHJK");
        Book book3 = new Maganze("dsdwef",243,234);
        Book book4 = new Textbook("dsg43d",243,234,"一年级");
        Book book5 = new Novel("dsbbd",243,234,"gfsger");
        ride test =new ridimpl();

        test.getstring(book1);
        test.getstring(book2);
        test.getstring(book3);
        test.getstring(book4);
        test.getstring(book5);
    }
}
