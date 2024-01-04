// Write a Java Program to Find the Transpose.

class pro24
{
    public static void printMatrix(int a[][])
    {
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int tra[][] = new int[3][3];

        for(int i = 0 ; i<3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                tra[j][i] = arr[i][j];
            }
        }

        System.out.println("matrix a :");
        printMatrix(arr);
        System.out.println("\ntranspose matrix :");
        printMatrix(tra);
    }
}