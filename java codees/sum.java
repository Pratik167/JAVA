import java.util.Scanner;
public class sum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first,second;
        System.out.println("Enter first number:");
        first=sc.nextInt();
        System.out.println("Enter second number:");
        second=sc.nextInt();

        System.out.println("Sum="+(first+second));
    }
}