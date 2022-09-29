import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double longA = 0;
        double longB = 0;
        double shortA = 0;
        double shortB = 0;
        double area = 0;
        double perimeter = 0;
        double triangle = 0;
        double square = 0;

        System.out.print("Enter the first long side of your rectangle: ");
        if(in.hasNextDouble())
        {
            longA = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is an incorrect input, Try Again!");
        }
//---------------------------------------------------------------------------------
        System.out.print("Enter the second long side of your rectangle: ");
        if(in.hasNextDouble())
        {
           longB = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is an incorrect input, Try Again!");
        }
//---------------------------------------------------------------------------------
        System.out.print("Enter the first short side of your rectangle: ");
        if(in.hasNextDouble())
        {
            shortA = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is an incorrect input, Try Again!");
        }
//---------------------------------------------------------------------------------
        System.out.print("Enter the second short side of your rectangle: ");
        if(in.hasNextDouble())
        {
            shortB = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("That is an incorrect input, Try Again!");
        }
//---------------------------------------------------------------------------------
        perimeter = (longA+longB+shortA+shortB);
        area = longA * shortA;
        triangle = ((longB * longB) + (shortB * shortB));
        square = Math.sqrt(triangle);


        System.out.println("The area of your rectangle is: " + area);
        System.out.println("the perimeter of the rectangle is: " + perimeter);
        System.out.println("The hypotenuse length is: " + square);
    }
}