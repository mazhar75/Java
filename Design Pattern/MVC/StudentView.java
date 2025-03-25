import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentView extends JFrame {
    private JTextField rollNoField;
    private JTextField nameField;
    private JButton updateButton;

    public StudentView() {
        setTitle("Student MVC Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Roll No:"));
        rollNoField = new JTextField();
        add(rollNoField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        updateButton = new JButton("Update");
        add(new JLabel()); // filler for layout
        add(updateButton);
    }

    // Methods to get and set data in the view
    public String getRollNo() {
        return rollNoField.getText();
    }

    public void setRollNo(String rollNo) {
        rollNoField.setText(rollNo);
    }

    public String getName() {
        return nameField.getText();
    }

    public void setName(String name) {
        nameField.setText(name);
    }

    // Register a listener for the update button
    public void addUpdateListener(ActionListener listener) {
        updateButton.addActionListener(listener);
    }
}
