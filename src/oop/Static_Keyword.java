//static makes the variable or method belong to the class rather than any specified object...
//commonly used for utility methods or shared resources
//utility methods mean stuff like the math class and all... we always use Math.round(3.98) instead of making an obj

package oop;

public class Static_Keyword
{
    public static void main(String[] args)
    {
        /*
        Friend fr1=new Friend("Hornet");
        System.out.println(fr1.numOffrnd);
        Friend fr2=new Friend("Lace");
        System.out.println(fr1.numOffrnd);

        this entire block will give 1 1 as output if the var numOffrnd is not static as each obj has its own copy of
        that var and that copy gets incremented instead of for each var separately instead of one unit for everyone
         */

        Friend fr1=new Friend("Hornet");
        System.out.println(fr1.numOffrnd);
        Friend fr2=new Friend("Lace");
        System.out.println(fr1.numOffrnd);
        System.out.println(fr2.numOffrnd);

        System.out.println(Friend.numOffrnd);
        //best to access a static attribute with the class name as that makes it more visible and readable for other devs
        //plus it makes known that this is a static attribute
        //its like all the objects have ownership of the var but instead of one obj owning it, the class owns it as a whole
        Friend.showfrnd();
    }
}
