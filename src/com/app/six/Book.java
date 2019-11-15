package com.app.six;

public class Book {
    private String name;
    private int    page;
    private int    much;

    public Book(String name, int page, int much) {
        this.name = name;
        this.page = page;
        this.much = much;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getMuch() {
        return much;
    }

    public void setMuch(int much) {
        this.much = much;
    }
}
