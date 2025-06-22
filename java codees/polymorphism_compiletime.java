class cal
{
    public void does(int x)
    {
        System.out.println("value of x:"+x);
    }
    public void does(int a,int b)
    {
        System.out.println("sum="+(a+b));
    }
}
public class polymorphism_compiletime {
 public static void main(String[]args)
 {
    cal c=new cal();
    c.does(5);
    c.does(5,6);
 }
}
