package com.app.six;

public class Textbook extends Book{
    private String grade;

    public Textbook(String name, int page, int much, String grade) {
        super(name, page, much);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
