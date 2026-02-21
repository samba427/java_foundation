package basics;

public class varargs
{
    public static void main(String[] args)
    {
        //varargs is variable arguments... a way to not have a fixed number of args in a method so that we can avoid having to usen overloaded funcs
        //java then packs all the args entered into an array

        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4));
    }
    static int sum(int... num)
    {
        int sum=0;
        for(int number : num)
        {
            sum+=number;
        }
        return sum;
    }

}
