import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class guiForManipulator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
    	UserAndMain obj=new UserAndMain();
    	
    	// Making the GUI components.
        JFrame frame = new JFrame("String Manipulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel l1=new JLabel("Input the String you want to Manipulate");
        JLabel l2=new JLabel("");
        JLabel l3=new JLabel("    ");
        JTextField inputField = new JTextField(20);
        JButton button1 = new JButton("Make it: Reverse");
        JButton button2 = new JButton("Make it: Uppercase");
        JButton button3 = new JButton("Make it: Lowercase");
        JButton button4 = new JButton("Check if palindrome");
        JButton button5 = new JButton("Remove numbers");
        
        
        // Adding the actionlistener for the Click of the button.
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = obj.reverse(input);
                l3.setText("-------------------------");
                l2.setText("-----> "+result+" <-----");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = obj.upper(input);
                l3.setText("-------------------------");
                l2.setText("-----> "+result+" <-----");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = obj.lower(input);
                l3.setText("-------------------------");
                l2.setText("-----> "+result+" <-----");
                }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = obj.palindrome(input);
                l3.setText("-------------------------");
                l2.setText("-----> "+result+" <-----");
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = obj.removeInt(input);
                l3.setText("-------------------------");
                l2.setText("-----> "+result+" <-----");
            }
        });

        // Adding all the components on the panel.
        panel.add(l1);
        panel.add(inputField);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(l3);
        panel.add(l2);    
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300, 320);
    }
}