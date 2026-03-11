package oop.Interfaces;
//  interface is a blueprint for a class that specifies a set of abstract methods that implementing classes
//  MUST define... it supports multiple inheritance-like behaviour
//  inheritance only allows for one parent while interface allows for multiple parents
public class Main
{
    public static void main(String[] args)
    {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk=new Hawk();
        hawk.hunt();

        Fish fish=new Fish();
        fish.flee();
        fish.hunt();
    }
}
