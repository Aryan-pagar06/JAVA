import java.util.*;
public class MaxMinArray
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size= input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size)
        {
           System.out.print("Enter element "+(i+1)+"=");
           arr[i]=input.nextInt();
           i++;
        }
        int maximum=max(arr, size);
        int minimum=min(arr, size);
        System.err.print("The maximum value = "+maximum);
        System.err.println("");
        System.err.print("The minimum value = "+minimum);
        
    }
public static int max(int arr[], int size)
{
    int max = arr[0];   
    int i = 1;         

    while (i < size)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
        i++;
    }
    return max;
}
public static int min(int arr[], int size)
{
    int min = arr[0];   
    int i = 1;         

    while (i < size)
    {
        if (arr[i] < min)
        {
            min = arr[i];
        }
        i++;
    }
    return min;
}

}