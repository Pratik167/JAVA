import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class mouselistener
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p,q;
        System.out.println("Enter P and Q:");
        p=s.nextInt();
        q=s.nextInt();
        JFrame f= new JFrame("Button");
        JButton b=new JButton("Click");
        JButton b2=new JButton("Click2");
        b.setBounds(50, 50, 100, 100);
        b2.setBounds(200, 200, 200, 200);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Button pressed");
            }
        });
        b2.addMouseListener(new MouseAdapter()
        {   
            public void mouseEntered(MouseEvent e)
            {
                System.out.println("Mouse Arrived");
            }
            public void mousePressed(MouseEvent e)
            {
                System.out.println("Sum="+(p+q));
            }
            public void mouseReleased(MouseEvent e)
            {
                System.out.println("Diff="+(p-q));
            }
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Mul"+(p*q));
            }
            public void mouseExited(MouseEvent e)
            {
                System.out.println("Mouse Bye Bye");
            }
        });
        f.add(b);
        f.add(b2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        s.close();
    }
}