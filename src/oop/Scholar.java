package oop;

import java.sql.SQLOutput;

public class Scholar extends Person{
    double gpa;
    Scholar(String first,String last,double gpa)
    {
        super(first,last);
        this.gpa=gpa;
    }
    void ShowGPA()
    {
        System.out.println(this.first+" has a gpa of "+this.gpa);
    }
}
