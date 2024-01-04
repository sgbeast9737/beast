// Write a Java Program to Check whether input character is vowel or consonant.
import java.util.Scanner;

class pro9
{
    public static void main(String[] args)
    {
        char a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character : ");
        a = sc.next().charAt(0);

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
        {
            System.out.println("character is vowel");
        }
        else
        {
            System.out.println("character is constant");
        }

    }
}