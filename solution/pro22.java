// Write a Java Program to Print a 2D Array.

class pro22
{
    public static void main(String[] args)
    {
        int _2D[][] = {{1,2,3,},{4,5,6},{7,8,9}};

        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                System.out.print(_2D[i][j] + " ");
            }
            System.out.println();
        }
    }

}