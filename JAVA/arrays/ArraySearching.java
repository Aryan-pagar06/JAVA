import java.util.*;
public class ArraySearching
{
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of array =");
       int size=input.nextInt();
       System.out.print("Enter the elements =");
       int arr[]= new int[size];
       int i=0;   
       while(i<size)
       {
        arr[i]=input.nextInt();
        i++;
       }
       System.out.println("Enter element you want to search = ");
       int element = input.nextInt();
       int j=0;
       while(j<size)
       {
        if(element==arr[j])
        {
            System.out.println("Element is present in the array");
            System.out.println("It is at position "+(j+1));
        }
        j++;
       }
    }
}