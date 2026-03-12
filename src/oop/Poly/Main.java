package oop.Poly;
//objects can be identified as other obj and treated as obj of a common superclass
public class Main {
    public static void main(String[] args)
    {
        Car car=new Car();
        Bike bike=new Bike();
        Boat boat=new Boat();
        car.go();
        bike.go();
        boat.go();

        //say we wanted to have a race and want to put all the obj into an arr... what should the datatype be?
        //Car[]={car,bike,boat}; wont work cause bike and boat arent car
        //applying the concept of polymorphism we can use what they all have in common, the superclass Vehicle
        Vehicle[] vehicles={car,bike,boat};
        for(Vehicle vehicle : vehicles)
        {
            vehicle.go();
        }
    }
}
