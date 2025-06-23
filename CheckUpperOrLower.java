import java.util.Scanner;
class CheckUpperOrLower
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println("the given alphabet is uppercase");
        }else
        {
            System.out.println("the given alphabet is lowercase");

        }
    }
}