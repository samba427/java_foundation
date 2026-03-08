package oop.ABSTRACTION;

public class Rectangle extends Shape{
    double l;
    double b;
    Rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    double area(){
        return l*b;
    }
}
