import java.util.Scanner;
public class xception {
 public static void main(String[] args) 
 {  
    Scanner sc=new Scanner(System.in);
     
     try {
        //  int a=5;
        //  int b=0;
        //  int c;
        //  c=a/b;
        int i;
         System.out.println("Enter nnumer:");
         i=sc.nextInt();
         if(i>2)
         {
            throw new Exception("i big");
         }
     }
     catch (Exception e) {
        System.out.println("no can do");
        System.out.println(e.getMessage());
    }
    finally
    {
        System.out.println("imma head out");
    }
 }
}
