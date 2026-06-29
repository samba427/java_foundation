package Getters_Setters;
public class CAR {
    private String model; // if i add in final after private then it cant be changed at all
    private String colour;
    private int price;

    CAR(String model,String colour,int price)
    {
        this.model=model;
        this.colour=colour;
        this.price=price;
    }

    String getModel()
    {
        return this.model;
    }

    String getColour()
    {
        return this.colour;
    }

    String getPrice()
    {
        //return this.price; we can do this ofc or we can also modify a lil...
        return "$"+this.price;
    }

    //we wrote getter methods for all 3 cause we want them all to be readable...
    //also we can repaint a car or sell for a different price... but the car cannot change its model so lets write setter methods for price and colour

    void setColour(String colour)
    {
        this.colour=colour;
    }

    void setPrice(int price)
    {
        if(price<0)
            System.out.println("price cant be less than 0");
        else this.price=price;
    }
}
