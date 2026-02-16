package basics;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name: ");
        String name= sc.nextLine(); // can use sc.next instead... that will read no spaces so if u enter a first and last name it will read the first name only
        System.out.println("Hi "+name);
        System.out.println("enter age ");
        int age=sc.nextInt();
        System.out.println("u are "+age+" yrs old");
        sc.close();// this is done as sc is an obj and closing it is good prct to ensure no unexpected behaviour
    }
}

/*while taking input... if u enter an int or double and then a string after, probs occur abt the new line char... to
remove this error the thing to do is after u take the int or double as input, type sc.nextLine();

for example
age=sc.nextInt();
sc.nextLine();
name=sc.nextLine();

the problem occurs because of the input buffer which stores the next line when we hit enter after typing in the number
 */
