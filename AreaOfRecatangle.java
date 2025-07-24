import java.util.Scanner;
class AreaOfRecatangle
{
    public static double printArea(double l ,double b)
    {
        double area = l*b;
        return area;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length:");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth:");
        double breadth = sc.nextDouble();
        System.out.println("The area of circle is :"+printArea(length,breadth));
    }
}