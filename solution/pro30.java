// Write a Java Program to Print even length words.
import java.util.Scanner;

class pro30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        String arrStr[] = str.split(" ");

        for(String s: arrStr)
        {
            if(s.length() % 2 == 0)
                System.out.println(s);
        }
    }
}