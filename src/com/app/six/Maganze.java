package com.app.six;

public class Maganze extends Book{

    public Maganze(String name, int page, int much, String dayofprint) {
        super(name, page, much);
        this.dayofprint = dayofprint;
    }

    public Maganze(String name, int page, int much) {

        super(name, page, much);
    }

    public String getDayofprint() {
        return dayofprint;
    }

    public void setDayofprint(String dayofprint) {
        this.dayofprint = dayofprint;
    }

    private String dayofprint;

}
