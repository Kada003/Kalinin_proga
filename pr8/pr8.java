package pr8;

import javax.swing.*;
import java.awt.*;

public class pr8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KaDa_0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JPanel panel_main = new JPanel();
        JPanel panel1 = new JPanel();
        panel_main.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));
        panel1.setBackground(Color.GRAY);
        panel_main.setBackground(Color.darkGray);
        JLabel label = new JLabel("hi");
        JLabel label1 = new JLabel("HI");
        label.setForeground(Color.white);
        label1.setForeground(Color.yellow);
        panel1.add(label);
        panel_main.add(label1);
        frame.getContentPane().add(panel_main,BorderLayout.PAGE_START);
        frame.getContentPane().add(panel1,BorderLayout.PAGE_END);
        frame.setVisible(true);


    }
}