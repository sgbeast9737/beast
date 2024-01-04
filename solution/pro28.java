// 28 Write a Java Program to Sort a string.
import java.util.Scanner;

class pro28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        char temp;

        for(int i = 0 , len = str.length ; i < len ; i++)
        {
            for (int j = i + 1 ; j < len ; j++)
            {
                if(str[i] > str[j])
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.print("sorted string : ");
        for(Character c: str)
        {
            System.out.print(c);
        }
        System.out.println();
    }
}