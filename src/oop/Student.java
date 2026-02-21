package oop;

public class Student
{
    String name;
    int age;
    double gpa;
    boolean isenrolled;

    Student(String name, int age, double gpa)
    {
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.isenrolled=true;
    }
    void study()
    {
        System.out.println(this.name+" is studying");
    }
}
