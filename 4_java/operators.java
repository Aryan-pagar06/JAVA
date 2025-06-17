import java.util.*;
public class operators
{
    public static void main (String [] args)
    {
       Scanner input = new Scanner (System.in);
       System.out.print("Enter first number = ");
       int num1= input.nextInt();
       System.out.print("");
       System.out.print("Enter second number = ");
       int num2=input.nextInt();
       System.out.println("Sum is = " + (num1 +num2));
       System.out.println("Diff is = " + (num1-num2));
       System.out.println("Product is = " + (num1 *num2));
       System.out.println("Quotient is = " + (num1 /num2));
       System.out.println("Remainder is = " + (num1 %num2));



    }
}