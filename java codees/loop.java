import java.util.Scanner;
public class loop {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int i,j=0;
        int []a=new int[5];
        System.out.println("Enter 5 numbers:");
        for(i=0;i<5;i++)
        {
            a[i]= s.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]>j)
            {
                j=a[i];
            }
        }
        System.out.println("Highest Number is:"+j);
        s.close();
    }
}
