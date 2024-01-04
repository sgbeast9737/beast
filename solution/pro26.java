// Write a Java Program to Replace a Character at a Specific Index.
import java.util.Scanner;

class pro26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.replace(str.charAt(2),'k'));
    }

}