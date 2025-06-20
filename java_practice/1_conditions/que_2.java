import java.util.*;
public class que_2
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.print("enter the number = ");
    int a= input.nextInt();
    System.out.print("enter the number = ");
    int b= input.nextInt();
    int max = (a>b)? a : b;
    System.out.println("max is "+max);
    

    }
}