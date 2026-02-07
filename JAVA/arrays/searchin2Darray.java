import java.util.*;
public class searchin2Darray
{
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of rows = ");
     int rows=input.nextInt();
     System.out.print("Enter the number of columns = ");
     int columns=input.nextInt();
     int nums[][]=new int[rows][columns];
     int i=0;
     
     while(i<rows)
     {
        int j=0;
        while(j<columns)
        {
            System.out.print("Enter [" + (i+1) + "][" + (j+1) + "] element = ");
            nums[i][j]=input.nextInt();
            j++;
        }
        i++;   
        }

        System.out.print("Enter the element you want to search = ");
        int key=input.nextInt();

        int answer=search(nums, key);
        if(answer==1)
        {
            System.out.println("Element is present in the matrix");
        }
        else{
            System.err.println("Element is not present in the matrix");
        }
     }


     public static int search(int nums[][], int key)
     {
        int i=0;
        while(i<nums.length)
        {
          int j=0;
          while(j<nums[i].length)
          {
             if(key==nums[i][j])
             {
                return 1;
             }

             j++;
          }
          i++;
        }

        return 0;
     }

  }   