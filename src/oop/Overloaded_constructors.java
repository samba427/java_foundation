//allow a class to have multiple constructors with diff parameter lists,
//enabling objs to be initialized in various ways

package oop;

public class Overloaded_constructors
{
    public static void main(String[] args)
    {
        User user1=new User("Samba");
        User user2=new User("Hornet", "shaw@pharloom.com");
    }
}
