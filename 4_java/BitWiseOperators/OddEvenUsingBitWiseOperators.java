import java.util.*;
public class OddEvenUsingBitWiseOperators
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your number = ");
       int num=input.nextInt();//0011 & 0001 = 1 (Result)
       int result = num & 1;
       if (result == 1)
       {
        System.out.println("Odd number");
       }
       else 
       {
        System.out.print("Even number");
       }

    }
}