import javax.swing.*;
import java.awt.event.*;
public class textfieldSUm {
public static void main(String[] args) {
    JFrame f= new JFrame("COME");
    JTextField tf1=new JTextField();
    tf1.setBounds(50, 50, 100, 100);
    JTextField tf2= new JTextField();
    tf2.setBounds(100, 100, 100, 100);
    JButton b= new JButton("Sum");
    b.setBounds(200, 200, 100, 100);
    b.addMouseListener(new MouseAdapter() 
    {
            public void mouseClicked(MouseEvent e) 
            {
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                    System.out.println("Sum = " + (num1 + num2));
                
            }
        });
    f.add(b);
    f.add(tf1);
    f.add(tf2);
    f.setSize(1000,1000);
    f.setLayout(null);
    f.setVisible(true);
}
}
