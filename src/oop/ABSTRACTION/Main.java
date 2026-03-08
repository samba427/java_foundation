package oop.ABSTRACTION;
// abstraction is used to define abstract classes and methods... abstraction is the process used to hide implementation details and showing only the essential features...
// abstract classes cant be instantiated directly
// can contain abstract methods which have to be implemented by its children
// can contain concreted methods which are inherited
// can think of it like teaching sm to drive a car, they have to know about the gas break and clutch... you dont pop the hood and show them every component
public class Main {
    public static void main (String[] args)
    {
        Circle circle = new Circle(5.5);
        // Shape shape = new Shape(); wont be allowed however
        circle.display();
        System.out.println(circle.area());
    }
}
