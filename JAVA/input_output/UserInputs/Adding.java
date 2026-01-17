import java.util.Scanner;
public class Adding
{
    public static void main(String[] args)
        {
            Scanner a=new Scanner(System.in);
            System.out.print("Enter your number = ");
            int num1=a.nextInt();
            System.out.print("Enter your second number = ");
            int num2=a.nextInt();
            int sum=num1+num2;
            System.out.println("The sum of the two numbers is: " + sum);
        }
    
}