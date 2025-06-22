package File_Handling;
import java.io.FileOutputStream;
import java.util.Scanner;
class User
{
    public String name= new String();
    public String address= new String();
}
public class IO
{
    public static void main(String []args)
    {
        Scanner s= new Scanner(System.in);
        User c=new User();
        System.out.println("Enter Name:");
        c.name=s.nextLine();
        System.out.println("Enter address:");
        c.address=s.nextLine();
        try
        {
            FileOutputStream f= new FileOutputStream("UserDetails.txt");
            f.write((c.name+"\n").getBytes());
            f.write(c.address.getBytes());
            f.close();
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        
    }
}