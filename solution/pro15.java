// Write a java program that initialize 1-D Array and display length of the array
// and its elements.

class pro15
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50,60,70,80};

        System.out.println("Length of array is " + a.length);
        for(Integer i: a)
        {
            System.out.println("Element of array : " + i);
        }
    }

}