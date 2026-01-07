import java.util.*;
public class returns
{
    public static void main(String[] args) 
    {
        greeting();
        int a =input();
        int b= input();
        int sum = a+b;
        System.out.println("sum is "+sum);

    }
    public static void greeting()
    {
        System.out.println("Good Morning!");
    }
    public static int input()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num= input.nextInt();
        return num;
    }

}