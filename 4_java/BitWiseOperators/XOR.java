import java.util.*;
public class XOR
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number =");
        int num=input.nextInt();
        System.out.print("Enter second number = ");
        int num1=input.nextInt();
        int result=num ^ num1;
        System.out.println("Result is = "+result);
    }
}