import java.util.*;
public class factorial
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your number = ");
       int num=input.nextInt();
       int fact=factorial(num);
       System.out.print("Factorial is = "+fact);

    }
    public static int factorial (int a) // 5
    {
        int i=1; // 1
        int fact=1; // 1
        while (i<=a) // 1<5
        {
            fact=fact*i; // 1=1*1, 1*1*2
            i++;
        }
        return fact;
    }
}