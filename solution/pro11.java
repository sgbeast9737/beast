// Write a Java Program to Find Even Sum of Fibonacci Series Till number N.
import java.util.Scanner;

class pro11
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0, n1 = 0 , n2 = 1 , n3 = 1 , sum = 0;

        System.out.print("Enter number : ");
        n = sc.nextInt();

        do
        {
            n3 = n1 + n2;

            if(n3 % 2 == 0)
            {
                sum += n3;
            }
            n1 = n2;
            n2 = n3;

        }while( n3 < n);

        System.out.println("sum of even number in fibonacci series is " + sum);       
    }
}