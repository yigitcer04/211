import java.awt.*;
import java.awt.event.*;

public class EmployeeForm extends Frame implements ActionListener {
    TextField nameField, idField, deptField;
    Label output;

    EmployeeForm() {
        setLayout(new FlowLayout());

        add(new Label("Name:"));
        nameField = new TextField(20);
        add(nameField);

        add(new Label("Employee ID:"));
        idField = new TextField(20);
        add(idField);

        add(new Label("Department:"));
        deptField = new TextField(20);
        add(deptField);

        Button submit = new Button("Submit");
        submit.addActionListener(this);
        add(submit);

        output = new Label("");
        add(output);

        setTitle("Employee Information Form");
        setSize(300, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String id = idField.getText();
        String dept = deptField.getText();
        output.setText("Name: " + name + " | ID: " + id + " | Dept: " + dept);
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}
