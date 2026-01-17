import java.util.*;
public class LCM
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number = ");
        int num=input.nextInt();
        System.out.print("Enter another number = "); 
        int num1=input.nextInt();
        lcm(num, num1);
        int ans=lcm(num, num1);
        System.out.println("lcm is = "+ans);
        
    }
    public static int lcm(int a, int b) // 15 , 20
    {
        int i=1;
        while (i<= b) // 1<20
        {
            int factor = a*i; // f=15*1=15
            if(factor % b==0)
            {
                return factor;
            }
            i++;
        }
 return 0;
    }
}