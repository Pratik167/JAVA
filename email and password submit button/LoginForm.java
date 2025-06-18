import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm 
{
    // Predefined credentials   
    private static final String PREDEFINED_EMAIL = "user@example.com";
    private static final String PREDEFINED_PASSWORD = "password123";

    public static void main(String[] args) 
    {
        // Create the main frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null); // Center the window

        // Create the main panel with a border (to simulate rectangle)
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Login"));
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        // Email label
        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(emailLabel, gbc);

        // Email text field
        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(emailField, gbc);

        // Password label
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(passwordLabel, gbc);

        // Password field
        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(passwordField, gbc);

        // Submit button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, gbc);

        // Button action listener
        submitButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String enteredEmail = emailField.getText();
                String enteredPassword = new String(passwordField.getPassword());

                if (enteredEmail.equals(PREDEFINED_EMAIL) && enteredPassword.equals(PREDEFINED_PASSWORD)) 
                {
                    System.out.println("Login Success");
                } 
                else 
                {
                    System.out.println("Login Failed");
                }
            }
        });

        // Add panel to frame and make visible
        frame.add(panel);
        frame.setVisible(true);
    }
}
