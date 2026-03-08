package oop;

public class Cat extends Animal{
    @Override //good prct to write this when overriding for other devs to know
    void Eats()
    {
        System.out.println("Cat eats mice");
    }
}
