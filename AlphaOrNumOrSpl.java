import java.util.Scanner;
class AlphaOrNumOrSpl
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='A'&&ch<='Z' ||ch>='a' && ch<='z')
        {
            System.out.println("the given char is alphabet");
        }else if(ch>=0 && ch<=9)
        {
            System.out.println("the given char is number");
        }else
        {
            System.out.println("the given char is special character");
        }
    }
}