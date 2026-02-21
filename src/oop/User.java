package oop;

public class User
{
    String username;
    String email;
    int age;

    User(String username)
    {
        this.username=username;
        this.email="not provided";
        this.age=0;
    }
    User(String usn, String email)
    {
        this.username=usn;
        this.email=email;
    }
}

