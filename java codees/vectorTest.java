import java.util.Vector;
import java.util.Scanner;
public class vectorTest 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Vector<Integer>v= new Vector <Integer>();
        int j=0;
        System.out.println("Enter 5 Numbers:");
        for(int i=0;i<4;i++)
        {
            v.add(sc.nextInt());
        }
        for(int i=0;i<v.size();i++)
        {
            if(j<v.get(i))
            {
                j=v.get(i);
            }
        }
        System.out.println(j);
        sc.close();
    }
}
