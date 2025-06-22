package File_Handling;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ioRead
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream f= new FileInputStream("UserDetails.txt");
            int i;
            while((i=f.read())!= -1)
            {
                System.out.print((char) i);
            }
            f.close();
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
    }
}