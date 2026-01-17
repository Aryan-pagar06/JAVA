import java.util.*;
public class palindrome
{
   public static void main(String[] args) 
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of the array = ");
       int size=input.nextInt();
       int[] arr=new int[100];
       int i=0;
       System.out.println("Enter elements = ");
       while(i<size)
       {
        
        arr[i]=input.nextInt();
        i++;
       }
       int answer=checkpalindrome(arr, size);
       if(answer == 1)
       {
        System.out.println("Array is palindromwe");
       }
       else{
        System.out.println("Array is not a palindrome");
       }
   }

   public static int checkpalindrome(int[] arr, int size)
   {
     int i=0;
     while(i<size/2)
     {
        if(arr[i] != arr[size-i-1])
        {
           return -1;
        }
        i++;
     }

     return 1;
   }
}