package basics;
import java.util.Random;

public class Randomnums
{
    public static void main(String[] args)
    {
        Random rd=new Random();
        int num=rd.nextInt(1,7);//random num from 1 to 6
        System.out.println(num);
        double dec=rd.nextDouble();
        boolean head_tail=rd.nextBoolean();
    }
}
