package com.app.six;

public class Novel extends Book{
    private String typeofnovel;

    public Novel(String name, int page, int much, String typeofnovel) {
        super(name, page, much);
        this.typeofnovel = typeofnovel;
    }

    public String getTypeofnovel() {
        return typeofnovel;
    }

    public void setTypeofnovel(String typeofnovel) {
        this.typeofnovel = typeofnovel;
    }
}
