import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
public class SimpleButton {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        JFrame f = new JFrame();               
        JButton b = new JButton("Click Me");
        int p,q;
        System.out.println("Enter p:");
        p=s.nextInt();
        System.out.println("Enter q:");
        q=s.nextInt();
        b.setBounds(100, 100, 100, 40);        

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("sum="+(p+q));
            }
        });

        f.add(b);                              
        f.setSize(300, 300);               
        f.setLayout(null);                     
        f.setVisible(true);         
    }
}
