import java.util.Scanner;
class AreaOfCircle
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the radius of the circle:");
         double radius = sc.nextDouble();
         double area = 3.142*radius*radius;
         System.out.println("the area of the circle is"+area);
    }
}