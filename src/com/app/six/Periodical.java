package com.app.six;

public class Periodical extends Book{
    private String dayofprint;

    public Periodical(String name, int page, int much, String dayofprint) {
        super(name, page, much);
        this.dayofprint = dayofprint;
    }

    public String getDayofprint() {
        return dayofprint;
    }

    public void setDayofprint(String dayofprint) {
        this.dayofprint = dayofprint;
    }
}
