import java.util.*;
public class CheckSorted 
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
        System.out.print("Enter element " +(i+1)+ "=");
        arr[i]=input.nextInt();
        i++;
       }
       int answer=check(arr, size);
         if(answer==1)
         {
            System.out.println("The array is sorted in ascending order");
         }
         else{
            System.out.println("The array is not sorted in ascending order");
         }
   }
   public static int check (int arr[], int size)
   {
    int count=0;
    int i=0;
    while(i<size-1 && arr[i]<=arr[i+1])
    {
        count++;
        i++;
    }
    if(count==size-1)
    {
      return 1;
    }
    else{
        return 0;
    }
   }
}