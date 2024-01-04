// Write a Java Program to Find the Perimeter of a Rectangle.
import java.util.Scanner;

class pro14
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int length = sc.nextInt();
        
        System.out.print("Enter width of rectangle : ");
        int width = sc.nextInt();

        System.out.println("\nPerimeter of rectangle :" + 2*(length + width));
    }
}