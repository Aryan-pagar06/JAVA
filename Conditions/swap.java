import java.util.Scanner;
public class swap
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number = ");
        int num1= input.nextInt();
        System.out.println("Enter the second number = ");
        int num2= input.nextInt();
        int c=num1;
        num1=num2;
        num2=c;
        System.out.println(num1);
        System.out.println(num2);



      
    }
}