import java.util.Scanner;
class SwapNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping two numbers:");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping two numbers:");
        System.out.println(a);
        System.out.println(b);
    }
}