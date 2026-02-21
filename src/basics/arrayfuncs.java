package basics;
import java.util.Arrays;
public class arrayfuncs
{
    public static void main(String[] args)
    {
        String[] fruits={"apple","orange","banana","cherry","mango"};

        for(String fruit : fruits)//enhanced for loop... easy to check thru collections with this
            System.out.println(fruit);

        Arrays.sort(fruits);//function from Arrays that sorts array elements
        for(String fruit : fruits)
            System.out.println(fruit);

        Arrays.fill(fruits, "pineapple");//function from Arrays that fills all elements with chosen value
        for(String fruit : fruits)
            System.out.println(fruit);
    }
}
