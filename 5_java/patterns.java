public class patterns
{
    public static void main(String[] args) 
    {
        println();
    }
    public static void println()
    {
       int rows=0;
       while (rows<6)
       {
        System.out.print("*");
        int i=0;
        while (i<rows)
        {
        System.out.print("*");
        i++; 
        }
        System.out.println("");
        rows++;
       }
    }
}