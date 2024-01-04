// Write a Java Program to Get a Character From the Given String.
import java.util.Scanner;

class pro27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String a = sc.nextLine();

        System.out.print("Reverse of a string is : ");
        for(int i = a.length() - 1; i >= 0 ; i--)
        {
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }
}