import java.util.*;
public class parameter
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter first number = ");
       int num1=input.nextInt();
       System.out.print("\nEnter second number = ");
       int num2=input.nextInt();
       int sum= addition (num1, num2);
       System.out.println(sum);
    }
    public static int addition(int a, int b)
    {
        return a+b;
    }
}