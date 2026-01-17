import java.util.*;
public class SumOfOdd
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number N = "); // 9 -> 1+3+5+7+9=25
        int N=input.nextInt();
       int sum = add(N);
       System.out.println("sum is "+sum);

    }
    public static int add (int x)
    {
        int sum=0;
        int i=1;
        while (i <=x)
        {
            sum=sum+i;
            i = i+2;
        }
        return sum;
    }
}    
