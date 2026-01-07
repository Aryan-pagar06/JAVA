import java.util.*;
public class SumAndAverage
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter the size of array = ");
        int size = input.nextInt();
        int arr[]=new int[size];
        int i=0;
        while (i<size)
        {
           System.out.print("Enter element "+(i+1)+ " = " );
           arr[i]=input.nextInt();
           i++;
        }
        int answer=sum(arr, size);
        System.out.println("The sum of digits is = " +answer);
        float average=avg(size, answer);
        System.out.println("The average of digits is = " +average);
    }
    public static int sum(int arr[], int size)
    {
       int j=0;
       int answer=0;
       while(j<size)
       {
        answer=answer+arr[j];
        j++;
       }
       return answer;
    }
    public static float avg(int size, int sum)
    {
       int avg=sum/size;
        return avg;
    }
}