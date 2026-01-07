import java.util.*;
public class reverse
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number = "); //1234
    int num=input.nextInt();
    while (num>=1){
    int rem=num%10; //1234%10=4 , 123%10=3 , 12%10=2, 1%10=1
    
    System.out.print(rem);  //4321
    
    num=num/10; //num=1234/10=123, num=123/10=12, num=12/10=1, num=1/10
    
    }
}
}