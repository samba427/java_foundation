package basics;

public class func_basic {
    public static void main(String[] args)
    {
        //overloaded funcs mean funcs with same name but different parameters

        /*funcs have a method signature which is the name plus the parameters of the func... for overloaded funcs the
        name is the same but the parameters are different so the signature is different
         */

        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4);
    }
    static void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    static void sum(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    static void sum(int a, int b, int c, int d)
    {
        System.out.println(a+b+c+d);
    }
}
