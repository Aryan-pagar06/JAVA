import java.util.*;
public class SimpleInterest
{
    public static void main (String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        float p=input.nextFloat();
        System.out.println("");
        System.out.print("Enter rate of inetrest (R) : ");
        float r=input.nextFloat();
        System.out.println("");
        System.out.print("Enter time of period (T) :");
        float t=input.nextFloat();
        System.out.println("");
        System.out.println("Simple Interest = "+(p*t*r)/100);

    }
}