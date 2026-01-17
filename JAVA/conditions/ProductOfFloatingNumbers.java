import java.util.*;
public class ProductOfFloatingNumbers
{
    public static void main (String []args)
    {
       Scanner in=new Scanner(System.in);
       System.out.print("Enter first number = ");
       float num1=in.nextFloat();
       System.out.println("");
       System.out.print("Enter second number = ");
       float num2=in.nextFloat();
       System.out.println("Product is = " + num1*num2);
    }
}