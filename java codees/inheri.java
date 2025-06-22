abstract class sound
{
    public void make()
    {}
}

class bike extends sound
{
    public void make()
    {
        System.out.println("Vroom Vroom");
    }
}
class car extends sound
{
    public void make()
    {
        System.out.println("sutututu");
    }
}
public class inheri 
{
 public static void main(String[]args)
 {
    bike b=new bike();
    b.make();
    car c=new car();
    c.make();
 }
}
