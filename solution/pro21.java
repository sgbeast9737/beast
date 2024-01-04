// Write a Java Program to Remove All Occurrences of an Element in an Array.
import java.util.Scanner;

class pro21
{
    public static int arraySize = 10;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[arraySize];
        int output = arraySize;

        for(int i = 0 ; i < arraySize ; i++)
        {
            System.out.print("Enter element to add in array : ");
            a[i] = sc.nextInt();
        }

        for (int i = 0 ; i < arraySize ; i++)
        {
            for(int j = i + 1 , k = 0; j < output ; j++)
            {
                if(a[i] == a[j])
                {
                    --output;
                    for( k = j ; k < arraySize - 1 ; k++ )
                    {
                        a[k] = a[k+1];
                    }
                }                  
            }
        }

        for(int i = 0 ; i < output ; i++)
        {
            System.out.println("Element of array : " + a[i]);
        }

    }
}