import java.util.*;
public class SumOfDigits
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number = ");
        int num=input.nextInt();
        int sum=digit(num);
        System.out.println("sum of digits is = "+sum);

    }
    public static int digit (int a) // 123
    {
        int i=0; // 0 
        int sum=0; // 0
        while(a>0)  // 0<123, 1<12 , 2<=1
        {
            int rem=a%10; // rem=123%10=3 , 3=12%10=2, 2=1%10=1
            a=a/10; // 123/10=12 , 12/10=1, 1/10=0
            sum=sum+rem; // 0=0+3, 0+3=0+3+2, 0+3+2=0+3+2+1
            
        }
        
       return sum;
    }
}