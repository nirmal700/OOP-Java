import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextColour {
    public static void main(String[] args) {
        JFrame jFrame1 = new JFrame("Color JButtons");
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        TextField tf1 = new TextField("Default");
        JButton b1 = new JButton("Red");
        JButton b2 = new JButton("Green");
        JButton b3 = new JButton("Blue");
        tf1.setBounds(100, 60, 180, 40);
        tf1.setFont(font1);
        b1.setBounds(50, 140, 80, 30);
        b2.setBounds(150, 140, 80, 30);
        b3.setBounds(250, 140, 80, 30);
        b1.setBackground(Color.red);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.green);
        // Actions
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("RED");
                tf1.setForeground(Color.red);
            };
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("BLUE");
                tf1.setForeground(Color.blue);
            };
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("GREEN");
                tf1.setForeground(Color.green);
            };
        });
        jFrame1.add(tf1);
        jFrame1.add(b1);
        jFrame1.add(b2);
        jFrame1.add(b3);
        jFrame1.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent we) {
                tf1.setText("Exiting...");
                tf1.setForeground(Color.black);
                System.exit(0);
            }
        });
        jFrame1.setBounds(750, 300, 400, 300);
        jFrame1.setLayout(null);
        jFrame1.setVisible(true);
    }
}