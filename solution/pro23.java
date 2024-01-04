// Write a Java Program to Add, Sub, Mul, Div of Two Matrices. [use menu
// driven concept].
import java.util.Scanner;

class pro23
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
        System.out.println();
    }

    public static void main(String[] args)
    {
        int Array1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int Array2[][] = {{7,8,9},{4,5,6},{1,2,3}};
        int add[][] = new int[3][3];
        int sub[][] = new int[3][3];
        int mul[][] = new int[3][3];
   

        //code for addition,substraction and multiplication of two Matrices 
        for(int row = 0 ; row < 3 ; row++)
        {
            for(int column = 0 ; column < 3 ; column++)
            {
                add[row][column] = Array1[row][column] + Array2[row][column];
                sub[row][column] = Array1[row][column] - Array2[row][column];
                for(int k = 0 ; k < 3 ; k++)
                {
                    mul[row][column] += Array1[row][k] * Array2[k][column];
                } 
            }
        }

        //menu driven concept
        Scanner sc = new Scanner(System.in);

        System.out.println("First matrix :");
        printMatrix(Array1);
        System.out.println("Second matrix :");
        printMatrix(Array2);

        System.out.println("1 - addition of matrices \n2 - substraction of matrices \n3 - multiplication of matrices");
        System.out.print("\nEnter your choice : ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1 : System.out.println("\nAddition of two Matrices :");
                     printMatrix(add);
                     break;

            case 2 : System.out.println("\nSubstraction of two Matrices :");
                     printMatrix(sub);
                     break;

            case 3 : System.out.println("\nmultiplication of two Matrices :");
                     printMatrix(mul);
                     break;

            default : System.out.println("Please enter valid choice");
        }

    }

}