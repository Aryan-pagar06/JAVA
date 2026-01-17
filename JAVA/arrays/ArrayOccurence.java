import java.util.*;
public class ArrayOccurence
{
   public static void main(String[] args) 
   {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of array = ");
    int size=input.nextInt();   
    int[] arr=new int[size];    
    int i=0;
    while(i<size)
    {
        System.out.print("Enter element "+(i+1)+ "=");
        arr[i]=input.nextInt();
        i++;
    }  
    System.out.print("Enter the element =");
    int element=input.nextInt();
    occurence(arr, size, element);
   }
   public static void occurence(int arr[], int size, int element)
   {
    int i=0;
    int count=0;
      while(i<size)
      {
         if(arr[i]==element)
         {
            count++;
         }
         i++;
      }
      if(count==0)
      {
        System.out.println("No element is found.");
      }
      else
      {
        System.out.println("The occurence is "+count);
      }
    
   }

}