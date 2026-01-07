import java.util.*;
public class multiplication
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num=input.nextInt();
        int i=1;
        while (i<=10)
        {
            int pro=num*i;
            System.out.println(num+"*"+i+"="+pro); //2+6+7+8
            i++;
        }

    }
}