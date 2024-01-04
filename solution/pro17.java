// Write a Java Program to Find the Largest Element in an Array.

class pro17
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50,100,70,80} , Largest = 0;

        for(Integer i: a)
        {
           if (Largest < i)
                Largest = i;
        }
        System.out.println("Largest element in array is " + Largest);
    }
}