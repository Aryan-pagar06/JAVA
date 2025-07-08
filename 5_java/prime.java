import java.util.*;
public class prime
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.err.println("Enter your number = ");
        int num=input.nextInt();
        int count =0;
        for (int i=2; i<=num; i++)
        {
        if (num%i==0)
        {
           count++; 
        }
        }
        if (count>=2)
        {
            System.err.println("not prime");
        }
        else 
        {
            System.out.println("prime");
        }
        

    }
    
}