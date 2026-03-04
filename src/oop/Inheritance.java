package oop;
//check NOTE 1 for extra tidbits
public class Inheritance {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();
        Human human = new Human();
        dog.Eats();
        cat.Eats();
        human.Eats();
        plant.photosynthesize();
    }
}
