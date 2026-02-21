//object is an entity that holds data(attributes) and can perform action(methods)... it is a reference datatype
//for example, if we were to think of a human, the attributes may be name,age,height etc...
//but the methods or rather actions can be eat sleep walk etc
// the class serves as the blueprint of the obj

package oop;

public class Main
{
    public static void main(String[] args)
    {
        Car obj1 =new Car();
        System.out.println(obj1.model);
        System.out.println(obj1.make);
        obj1.stop();
        System.out.println(obj1.isrun);
        Car obj2=new Car();


        Student obj=new Student("Samba", 30, 2.8);
        System.out.println(obj.name);
        Student student=new Student("Hornet", 1000000, 10.11);
        System.out.println(student.gpa);
        obj.study();

    }

}

//object is an entity that holds data(attributes) and can perform action(methods)... it is a reference datatype
//for example, if we were to think of a human, the attributes may be name,age,height etc...
//but the methods or rather actions can be eat sleep walk etc
// the class serves as the blueprint of the obj