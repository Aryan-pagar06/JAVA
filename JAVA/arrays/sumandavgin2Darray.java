import java.util.*;
public class sumandavgin2Darray
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
      float sum=add(nums);
      float mean=avg(nums, sum, rows, columns);
      System.err.println("Sum of all the elements = " + sum);
      System.err.println("Average of all the elements = " + mean);

  }

public static float add(int nums[][])
     {
        int i=0;
        int sum=0;
        while(i<nums.length)
        {
          int j=0;
          while(j<nums[i].length)
          {
            sum=sum+nums[i][j];
            j++;
          }
          i++;
        }

        return sum;
     }

public static float avg(int nums[][], float sum, int rows, int columns)
     {
      float avg=0;
      avg=sum/(rows*columns);
      return avg;
     }

  }   