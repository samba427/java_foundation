package oop;

public class Car
{
    String make="Ford";
    String model="Mustang";
    int year=2026;
    double price=30000000;
    boolean isrun=true;

    void start()
    {
        System.out.println("u start the engine");
        isrun=true;
    }
    void stop()
    {
        System.out.println("you stop the engine");
        isrun=false;
    }
}
