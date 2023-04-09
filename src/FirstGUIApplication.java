import javax.swing.*;
import java.awt.BorderLayout;

public class FirstGUIApplication {
    public static void main(String[] args){
        JFrame frame = new JFrame("First GUI Application");
        JTextField textField = new JTextField();
        JButton button = new JButton("Click Button");
        frame.add(button, BorderLayout.SOUTH);
        frame.add(textField, BorderLayout.NORTH);
        // JLabel labelNorth = new JLabel("First GUI Application");
        // labelNorth.setHorizontalAlignment(JLabel.CENTER);
        // frame.add(labelNorth, BorderLayout.CENTER);
        frame.setSize(300,200);
        frame.setVisible(true);




    }
}
