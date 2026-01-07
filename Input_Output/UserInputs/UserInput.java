import java.util.Scanner;
public class UserInput
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine(); // Read user input as a string
        System.out.println("Hello, " + name + "!");
        System.out.println("Enter your age: ");
        int age =input.nextInt();
        System.out.println("ooh! "+name+"'s age is "+ age+"");
    }
}