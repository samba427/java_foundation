package oop;

public class ToStringDeets {
    public static void main(String[] args)
    {
        // .toString() is a method inherited from the object class... used to return a string representation of an object
        // by default it returns a hash code as a unique identifier... can be overriden to provoide meaningful deets

        Plane plane=new Plane(  "Ford","Mustang",2007,"Red");
        System.out.println(plane);


    }
}
