import javax.swing.*;// imports swing (GUI) components (JFrame, JTextField, Jbutton ,etc)
import java.awt.*;// imports layout manager which helps in alignment of the things in the frame
import java.awt.event.*;// imports all the event handling like actionlistener action handler

public class UserForm 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("User Information Form");          // Creates a window with title
        frame.setSize(500, 600);                                     // Sets the size of the window (width ra height)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // Closes the app when the window is closed
        frame.setLayout(new GridLayout(0, 2, 10, 10));               // Uses GridLayout with 2 columns and spacing

        // --- Text Fields ---
        JLabel nameLabel = new JLabel("Name:");                      // Label for Name
        JTextField nameField = new JTextField();                     // Input  for Name

        JLabel emailLabel = new JLabel("Email:");                    // Label for Email
        JTextField emailField = new JTextField();                    // Input  for Email

        JLabel phoneLabel = new JLabel("Phone:");                    // Label for Phone
        JTextField phoneField = new JTextField();                    // Input  for Phone

        // --- Gender Radio Buttons ---
        JLabel genderLabel = new JLabel("Gender:");                  // Label for Gender
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));  // Panel to group gender buttons
        JRadioButton male = new JRadioButton("Male");                // Male option
        JRadioButton female = new JRadioButton("Female");            // Female option
        JRadioButton other = new JRadioButton("Other");              // Other option
        ButtonGroup genderGroup = new ButtonGroup();                 // Group to allow only one gender selection
        genderGroup.add(male);                                       // Add male to group
        genderGroup.add(female);                                     // Add female to group
        genderGroup.add(other);                                      // Add other to group
        genderPanel.add(male);                                       // Add male button to panel
        genderPanel.add(female);                                     // Add female button to panel
        genderPanel.add(other);                                      // Add other button to panel

        // --- Nationality Dropdown ---
        JLabel nationalityLabel = new JLabel("Nationality:");        // Label for Nationality
        String[] countries = {                                       // List of countries
            "Nepal", "India", "Bangladesh", "Bhutan"
        };
        JComboBox<String> nationalityBox = new JComboBox<>(countries); // Dropdown list for nationality

        // --- Qualification Combo Box ---
        JLabel qualificationLabel = new JLabel("Qualification:");    // Label for qualification
        String[] qualifications = {"High School", "Diploma", "Bachelor's", "Master's", "PhD"};
        JComboBox<String> qualificationBox = new JComboBox<>(qualifications); // Dropdown for qualification level

        // --- Areas of Interest Checkboxes ---
        JLabel interestLabel = new JLabel("Areas of Interest:");     // Label for interests
        JPanel interestPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Panel for checkboxes
        JCheckBox reading = new JCheckBox("Reading");                // Checkbox for Reading
        JCheckBox sports = new JCheckBox("Sports");                  // Checkbox for Sports
        JCheckBox music = new JCheckBox("Music");                    // Checkbox for Music
        JCheckBox travel = new JCheckBox("Travel");                  // Checkbox for Travel
        JCheckBox coding = new JCheckBox("Coding");                  // Checkbox for Coding
        interestPanel.add(reading);                                  // Add to panel
        interestPanel.add(sports);
        interestPanel.add(music);
        interestPanel.add(travel);
        interestPanel.add(coding);

        // --- Short Description ---
        JLabel descLabel = new JLabel("Short Description:");         // Label for description
        JTextArea descArea = new JTextArea(3, 20);                   // Multi-line text area
        JScrollPane descScroll = new JScrollPane(descArea);          // Scrollable pane for text area

        // --- Submit Button ---
        JButton submitButton = new JButton("Submit");                // Button to submit form

        // --- Action Listener for Submit ---
        submitButton.addActionListener(e -> {                        // When submit is clicked:
            String name = nameField.getText();                       // Get name
            String email = emailField.getText();                     // Get email
            String phone = phoneField.getText();                     // Get phone
            String gender = male.isSelected() ? "Male" :             // Determine gender
                             female.isSelected() ? "Female" : "Other";
            String nationality = (String) nationalityBox.getSelectedItem(); // Get selected nationality
            String qualification = (String) qualificationBox.getSelectedItem(); // Get qualification

            StringBuilder interests = new StringBuilder();           // Store selected interests
            if (reading.isSelected()) interests.append("Reading ");
            if (sports.isSelected()) interests.append("Sports ");
            if (music.isSelected()) interests.append("Music ");
            if (travel.isSelected()) interests.append("Travel ");
            if (coding.isSelected()) interests.append("Coding ");

            String description = descArea.getText();                 // Get short description

            // Print all collected information to console
            System.out.println("----- User Info -----");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Gender: " + gender);
            System.out.println("Nationality: " + nationality);
            System.out.println("Qualification: " + qualification);
            System.out.println("Interests: " + interests.toString().trim());
            System.out.println("Description: " + description);
        });

        // --- Add all components to the frame ---
        frame.add(nameLabel); frame.add(nameField);                 // Add name label and field
        frame.add(emailLabel); frame.add(emailField);               // Add email
        frame.add(phoneLabel); frame.add(phoneField);               // Add phone
        frame.add(genderLabel); frame.add(genderPanel);             // Add gender
        frame.add(nationalityLabel); frame.add(nationalityBox);     // Add nationality
        frame.add(qualificationLabel); frame.add(qualificationBox); // Add qualification
        frame.add(interestLabel); frame.add(interestPanel);         // Add interests
        frame.add(descLabel); frame.add(descScroll);                // Add description
        frame.add(new JLabel()); frame.add(submitButton);           // Empty label for spacing + submit button

        frame.setVisible(true);                                     // Display the frame on screen
    }
}
