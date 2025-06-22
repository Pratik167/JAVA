import java.util.Scanner;
public class name
{
    public static void main(String[]args)
    {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Your Name:");
    String name=s.nextLine();
    System.out.println("your name is:"+name);
    s.close();
    }
}
