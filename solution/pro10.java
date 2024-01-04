// Write a Java Program to Find Factorial of a number
import java.util.Scanner;

class pro10
{
    public static void main(String[] args){
        int n = 1 , ans = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        n = sc.nextInt();


        for (int i = 1 ; i <= n ; i++)
        {
            ans *= i;
        }
        System.out.println("Factorial of " + n + " is " + ans);
    }

}