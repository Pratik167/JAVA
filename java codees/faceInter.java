interface sound {

    void make();
    
}
interface noise
{
    void make();
}
class cars implements sound, noise
{
    public void make()
    {
        System.out.println("vroom");
    }
}
public class faceInter 
{
public static void main(String[] args)
{
    cars s=new cars();
    s.make(); 
}
}
