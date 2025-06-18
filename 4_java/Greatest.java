import java.util.*;
public class Greatest
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your first number = ");
        int a= input.nextInt();
        System.out.print("\nEnter your second number = ");
        int b= input.nextInt();
        System.out.print("\nEnter your third number = ");
        int c= input.nextInt();
        if (a>b && a>c)
        {
            System.out.println("First number is greatest");
        }
        else if (b>a && b>c)
        { 
            System.out.println("Second number is greatest");
        }
        else 
        {
            System.out.println("Third number is greatest");
        }

    }
}