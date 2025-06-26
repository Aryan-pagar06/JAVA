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
    public static int lcm(int a, int b) // num%x==0 && num%y == 0
    {
        int i=1;
        while (i<= b)
        {
            int factor = a*i;
            if(factor % b==0)
            {
                return factor;
            }
            i++;
        }
 return 0;
    }
}