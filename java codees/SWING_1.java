import javax.swing.*;
public class SWING_1 {
public static void main(String[] args) {
    String [] s={"hi","hllo"};
    JFrame f1= new JFrame("FirstOne");
    JLabel jl=new JLabel("hi");
    JTextField tf=new JTextField();
    JButton b=new JButton("click");
    JComboBox<String> cb=new JComboBox<>(s);
    f1.setSize(500, 500);
    f1.add(b);
    f1.add(tf);
    f1.add(jl);
    f1.add(cb);
    cb.setBounds(350,350,50,50);
    b.setBounds(50, 50, 200, 50);
    tf.setBounds(100, 100, 50, 50);
    jl.setBounds(250,250,50,50);
    f1.setLayout(null);
    f1.setVisible(true);
    
}

}
