import java.util.Scanner;
public class UserInputs2
{
   public static void main (String[]args)
   {
    Scanner input = new Scanner (System.in);
    System.out.print("enter your name : ");
    String name = input.nextLine();
    System.out.println("hello,"+name+" welcome");



   }

}