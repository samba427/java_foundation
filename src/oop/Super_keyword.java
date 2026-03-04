package oop;

public class Super_keyword {
    public static void main(String[] args)
    {
        Person person = new Person("Sam","Ba");
        person.ShowName();
        Scholar scholar=new Scholar("Sam","Ba",9.2);
        scholar.ShowName();
        scholar.ShowGPA();
    }
}
