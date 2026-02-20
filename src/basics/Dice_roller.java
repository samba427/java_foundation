package basics;

import java.util.Scanner;
import java.util.Random;

public class Dice_roller
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of dice to roll ");
        int dice=sc.nextInt();
        int tot=0;
        Random rd=new Random();
        for(int i=1;i<=dice;i++)
        {
            int current=rd.nextInt(1,7);
            tot+=current;
            dice_art(current);
        }
        System.out.println();
        System.out.println("total sum of the dice is " + tot);
        sc.close();
    }
    static void dice_art(int n)
    {
        if(n==1)
        {
            System.out.println("-------");
            System.out.println("|     |");
            System.out.println("|  o  |");
            System.out.println("|     |");
            System.out.println("-------");
        }
        if(n==2)
        {
            System.out.println("-------");
            System.out.println("|     |");
            System.out.println("|o   o|");
            System.out.println("|     |");
            System.out.println("-------");
        }
        if(n==3)
        {
            System.out.println("-------");
            System.out.println("|  o  |");
            System.out.println("|  o  |");
            System.out.println("|  o  |");
            System.out.println("-------");
        }
        if(n==4)
        {
            System.out.println("-------");
            System.out.println("|o   o|");
            System.out.println("|     |");
            System.out.println("|o   o|");
            System.out.println("-------");
        }
        if(n==5)
        {
            System.out.println("-------");
            System.out.println("|o   o|");
            System.out.println("|  o  |");
            System.out.println("|o   o|");
            System.out.println("-------");
        }
        if(n==6)
        {
            System.out.println("-------");
            System.out.println("|o   o|");
            System.out.println("|o   o|");
            System.out.println("|o   o|");
            System.out.println("-------");
        }
        if(n==6)
        {
            System.out.println("-------");
            System.out.println("|     |");
            System.out.println("|  o  |");
            System.out.println("|     |");
            System.out.println("-------");
        }
    }
}
