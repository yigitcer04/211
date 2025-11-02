import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PassFailExamDemo extends JFrame {
    private JTextField questionsField;
    private JTextField missedField;
    private JTextField minPassingField;
    private JButton calcButton;
    private JTextArea outputArea;

    public PassFailExamDemo() {
        // Set up the frame
        setTitle("Pass/Fail Exam Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Create labels and text fields
        add(new JLabel("How many questions are on the exam?"));
        questionsField = new JTextField(10);
        add(questionsField);

        add(new JLabel("How many questions did the student miss?"));
        missedField = new JTextField(10);
        add(missedField);

        add(new JLabel("What is the minimum passing score?"));
        minPassingField = new JTextField(10);
        add(minPassingField);

        // Add calculate button
        calcButton = new JButton("Calculate Result");
        add(calcButton);

        // Output area
        outputArea = new JTextArea(5, 25);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        // Button action
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });

        // Pack and show
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void calculateResult() {
        try {
            int questions = Integer.parseInt(questionsField.getText());
            int missed = Integer.parseInt(missedField.getText());
            double minPassing = Double.parseDouble(minPassingField.getText());

            PassFailExam exam = new PassFailExam(questions, missed, minPassing);

            String message = "Each question counts " + exam.getPointsEach() + " points.\n"
                           + "The exam score is " + exam.getScore() + "\n"
                           + "The exam grade is " + exam.getGrade();

            outputArea.setText(message);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numbers only.");
        }
    }

    public static void main(String[] args) {
        new PassFailExamDemo();
    }
}
