package oop.Interfaces;

public class Rabbit implements Prey//implements is used as it is an interface
{
    @Override
    public void flee()
    {
        System.out.println("The rabbit is running away");
    }
}
