public class que_4
{
    public static void main(String[] args) 

    {
                       System.out.println("prime numbers are = 2 ");
               System.out.println("prime numbers are = 3 ");
               System.out.println("prime numbers are = 5 ");
               System.out.println("prime numbers are = 7 ");
               System.out.println("prime numbers are = 11 ");
        for(int i=2; i<=100; i++)
        {
            if (i%1==0 && i%i==0 && i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0) 
            {
              
               System.out.println("prime numbers are = "+i);


            }
        }
    }
}