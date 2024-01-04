// Write a Java Program to Search an Element in an Array
import java.util.Scanner;

class pro16
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50,60,70,80,60};
        boolean notFound = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number you want to search :");
        int search = sc.nextInt();

        for(int i = 0 , len = a.length ; i < len ; i++)
        {
            if(search == a[i])
            {
                System.out.println("Element found at " + (i+1) + " position");
                notFound = false;
            }
        }

        if(notFound)
            System.out.println("Element not found in array");
    }

}