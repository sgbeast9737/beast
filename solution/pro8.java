// Write a Java Program to Check Armstrong Number between Two Integers.
import java.util.Scanner;

class pro8
{
    //function which checks either number is armstrong or not.
    public static boolean armst(int n)
    {
        int out = 0 , len = 0 , num = n , dig = 0 ;

        //this loop calculates total digits in a given number.
        while(n / 10 != 0)
        {
            n = n / 10;
            len++;
        }
        n = num;
        len += 1;

        //this loop store sum of every single digits to the power of its length into variable out.
        for(int i = 0 ; i < len ; i++)
        {
            //if we divide any number with 10 then its remainder always its last digit. example(153 % 10 = 3 )(15 % 10 = 5)
            dig = (n % 10);
            out = (int)(out + Math.pow(dig,len));
            n = n / 10;
        }

        return out == num;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();

        for(int i = a ; i < b ; i++)
        {
            if(armst(i))
            {
                System.out.println(i + " is Armstrong number");
            }
        }
    }
    
}