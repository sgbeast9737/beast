// Write a Java Program to Calculate Simple Interest.
import java.util.Scanner;

class pro12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = 0 , Interest = 0;

        System.out.print("Enter amount : ");
        amount = sc.nextInt();

        Interest = (amount * 10 * 1)/100; 

        System.out.println("Interest is " + Interest);
    }
}