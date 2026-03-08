package oop.ABSTRACTION;
public abstract class Shape {
    abstract double area();// abst method

    void display(){ // CONCRETE... doesnt have to be implemented
        System.out.println("THIS IS A SHAPE");
    }
}
