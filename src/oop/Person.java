package oop;

public class Person {
    String first;
    String last;

    Person(String first,String last)
    {
        this.first=first;
        this.last=last;
    }
    void ShowName()
    {
        System.out.println(this.first+" "+this.last);
    }

}
