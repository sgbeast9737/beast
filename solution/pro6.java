// Write a Java Program to Display All Prime Numbers from 1 to N.
import java.util.Scanner;

class pro6
{
    public static void main(String[] args)
    {
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++)
        {
            for(int chk = 2 ; chk < i ; chk++)
            {
                if( i % chk == 0)
                {
                    isPrime = false;
                }
            }

            if(isPrime)
            {
                System.out.println( i + " is prime number");
            }
            isPrime = true;
        }
    }

}