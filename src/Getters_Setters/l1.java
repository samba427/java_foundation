//getters and setters: help protect object data and add rules for accessing and modifying them
//getters=methods that make a field readable
//setters=methods that make a field writable

package Getters_Setters;
public class l1
{
    public static void main(String[] args)
    {

        CAR car=new CAR("Mustang","Red",15000);
        //System.out.println(car.colour+" "+car.model+ " "+car.price); wont work as the attributes are private
        System.out.println(car.getColour()+" "+car.getModel()+" "+car.getPrice());

        //car.colour="pink;" doesnt work cause pvt
        car.setColour("Blue");
        car.setPrice(-4000);

        System.out.println(car.getColour()+" "+car.getModel()+" "+car.getPrice());

    }
}
