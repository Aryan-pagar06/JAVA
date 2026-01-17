import java.util.*;
public class rectangle
{
    public static void main(String[] args)
    {
       Scanner dimensions = new Scanner(System.in);
       System.out.print("Enter width = ");
       float w = dimensions.nextFloat();
       System.out.print("Enter length = ");
       float l = dimensions.nextFloat();
       System.out.println("Perimeter is = " + 2 * (w + l));
    }
}   