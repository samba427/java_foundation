package oop;

public class Friend
{
    static int numOffrnd;
    String name;
    Friend(String name)
    {
        this.name=name;
        numOffrnd++;
    }
    static void showfrnd()
    {
        System.out.println("you have "+ numOffrnd+" frnds in all");// we dont need this.numoffrnd as it is static and belongs to the class
    }
}
