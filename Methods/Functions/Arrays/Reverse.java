import java.util.*;
public class Reverse
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size)
       {
        System.out.print("Enter element " +(i+1)+ "=");
        arr[i]=input.nextInt();
        i++;
       }
        System.out.print("Array = ");
        i=0;
        while(i<size)
        {
            System.out.print(" " + arr[i]);
            i++;
        }
        System.err.println("");
        reverse(arr, size);
    }
    public static void reverse (int arr[], int size)
    {
       int j=size-1;
       System.err.print("Reversed array = ");
       while(j>=0)
       {
        System.out.print(" " + arr[j]);
        j--;
       }

    }
}