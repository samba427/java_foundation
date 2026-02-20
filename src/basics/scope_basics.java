package basics;

public class scope_basics
{
    static int x=3;//class variable... scope is class
    public static void main(String[] args)
    {
        int x=1;//local variable... but scope is main method
        System.out.println(x);
        dosome();
    }
    static void dosome()
    {
        int x=2;//local variable... but scope is dosome method
        System.out.println(x);
    }
    //even though the class variable has been defined the local variables are used with priority as we can see in the output
}
