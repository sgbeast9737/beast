// Write a Java Program to Find Largest Among 3 Numbers.

class pro5
{
    public static void main(String[] args)
    {
        int a = 15 , b = 10 , c = 30;

        if( a > b && a > c)
        {
            System.out.println(a + " is largest among all nummbers");
        }
        else if( b > a && b > c)
        {
            System.out.println(b + " is largest among all nummbers");
        }
        else if( c > b && c > a)
        {
            System.out.println(c + " is largest among all nummbers");
        }
        else
        {
            System.out.println("All numbers are same");
        }

    }

}