class odd extends Thread
{
    public void run()
    {
        for(int i=11;i<50;i=i+2)
        {
            System.out.println("Odd:"+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Odd intteruppted");
            }
        }
    }
}
class even extends Thread
{
    public void run()
    {
        for(int i=50;i<100;i=i+2)
        {
            System.out.println("Even:"+i);
            
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println("Even Interruppted");
            }
        }
    }
}
public class multiThread
{
    public static void main(String[] args) {
        odd o=new odd();
        even e=new even();
        o.start();
        e.start();
    }
}
