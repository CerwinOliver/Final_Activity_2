import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInfoGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Student Information Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel courseLabel = new JLabel("Course:");
        JTextField courseField = new JTextField();
        
        JLabel sectionLabel = new JLabel("Section:");
        JTextField sectionField = new JTextField();
        
        JLabel deptLabel = new JLabel("Department:");
        JTextField deptField = new JTextField();
        
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(sectionLabel);
        frame.add(sectionField);
        frame.add(deptLabel);
        frame.add(deptField);
        frame.add(submitButton);
        frame.add(clearButton);

        // Submit button action
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String course = courseField.getText();
                String section = sectionField.getText();
                String dept = deptField.getText();
                
                if (name.isEmpty() || course.isEmpty() || section.isEmpty() || dept.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, 
                        "Please fill in all fields!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    String message = "Submitted:\n\n" +
                                    "Name: " + name + "\n" +
                                    "Course: " + course + "\n" +
                                    "Section: " + section + "\n" +
                                    "Department: " + dept;
                    
                    JOptionPane.showMessageDialog(frame, 
                        "Submitted", 
                        "Success", 
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Clear button action
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                courseField.setText("");
                sectionField.setText("");
                deptField.setText("");
                JOptionPane.showMessageDialog(frame, 
                    "Cleared", 
                    "Clear", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Center the frame on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}