package oop;

public class Bike
{
    String model;
    String colour;

    Bike(String model, String colour)
    {
        this.model=model;
        this.colour=colour;
    }
    void drive()
    {
        System.out.println("u drive the " +  this.colour + " " + this.model);
    }
}
