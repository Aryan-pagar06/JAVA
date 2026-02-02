import java.util.*;
public class mergesortedarrays
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int size1, size2;
        System.out.print("Enter the size of first array = ");
        size1=input.nextInt();
        int i=0;
        int arr1[]= new int[size1];
        while(i<size1)
        {
            System.out.print("Enter " + (i+1) + " element =");
            arr1[i]=input.nextInt();
            i++;
        }
        System.out.print("Enter the size of the second array = ");
        size2=input.nextInt();
        int arr2[]=new int[size2];
        int j=0;
        while(j<size2)
        {
            System.out.print("Enter " + (j+1) + " element = ");
            arr2[j]=input.nextInt();
            j++;
        }
        int[] mergedarray=merge(arr1, arr2);
        int k=0;
        System.err.println("Merged array is = ");
        while(k<mergedarray.length)
        {
           System.out.print(mergedarray[k] + " ");
           k++;
        }
    }

    public static int[] merge(int arr1[], int arr2[])
    {
        //two pointer approach
        int newsize=arr1.length + arr2.length;
        int[] newarray=new int[newsize];
        int i=0, j=0, k=0;
        while(i<arr1.length || j<arr2.length)
        {
            if(j==arr2.length  || (i<arr1.length && arr1[i]<arr2[j]))
            {
                newarray[k]=arr1[i];
                i++;
                k++;
            }
            else 
            {
                newarray[k]=arr2[j];
                j++;
                k++;
            }
            
        }

        return newarray;
        

    }
}