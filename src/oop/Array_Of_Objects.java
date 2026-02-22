package oop;

public class Array_Of_Objects
{
    public static void main(String[] args)
    {
        Bike bike1=new Bike("GT 650", "Black");
        Bike bike2=new Bike("Classic 650", "royal blue");
        Bike bike3=new Bike("Shotgun 650", "asteroid grey");
        //Car[] cars = new Car[3]; or we can assign directly
        Bike[] bikes={bike1,bike2,bike3};
        for(int i=0;i<bikes.length;i++)
        {
            bikes[i].drive();
        }
        //tho it would be better to use an enhanced for loop for this
        for(Bike bike : bikes)
        {
            bike.drive();
        }
    }

}
