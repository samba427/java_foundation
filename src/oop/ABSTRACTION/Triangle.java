package oop.ABSTRACTION;

public class Triangle extends Shape{
    double b;
    double h;
    Triangle(double b,double h)
    {
        this.b=b;
        this.h=h;
    }
    @Override
    double area(){
        return 0.5*b*h;
    }
}
