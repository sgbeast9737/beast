// Write a Java Program to Sort an Array.
import java.util.Scanner;

class pro18
{
    public static int arraySize = 10; 

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[arraySize] , Largest = 0;

        for(int i = 0 , temp = 0; i < arraySize ; i++)
        {
            System.out.print("Enter element to add in array : ");
            a[i] = sc.nextInt();

            for(int j = 0 ; j < i ; j++)
            {
                if(a[j] > a[i])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;                    
                }
            }
        }

        for(int i = 0 ; i < arraySize ; i++)
        {
            System.out.println("Element of array : " + a[i]);
        }
    }
}