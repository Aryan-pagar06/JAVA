import java.util.*;
public class que_1
{
  public static void main (String []agrs)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("enter the number = ");
    int num= input.nextInt();
    if (num%2!=0)
    {
        System.out.println("odd");
    }
    else if (num==0)
    {
        System.out.println("zero");
    }
    else 
    {
        System.out.println("even");
    }

  }
}