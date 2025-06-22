import java.awt.*;
public class appletdemo
{
    public static void main(String[] args) {
        Frame f=new Frame("Hello");
        Button b=new Button("Click");
        f.add(b);
        b.setBounds(50,50, 500,500);
        f.setSize(100,100);
        f.setLayout(null);
        f.setVisible(true);
    }
}