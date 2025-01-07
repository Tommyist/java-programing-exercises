import javax.swing.*;
import java.awt.BorderLayout;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setSize(400, 250);
        JPanel pane = (JPanel) frame.getContentPane();
        pane.setLayout(new BorderLayout());
        JButton button = new JButton("Button 1 (PAGE_START)");
        pane.add(button, BorderLayout.PAGE_START);
        // Make the center component big, since that';s the
        // typical usage of BorderLayout.
        JButton buttonc1 = new JButton("Central 1");
        JButton buttonc2 = new JButton("Central 2 ");
        JButton buttonc3 = new JButton("Central 3 ");
        JButton buttonc4 = new JButton("Central 4 ");
        JButton buttonc5 = new JButton("Central 5 ");
        JPanel Centro = new JPanel();
        Centro.add(buttonc1);
        Centro.add(buttonc2);
        Centro.add(buttonc3);
        Centro.add(buttonc4);
        Centro.add(buttonc5);

        pane.add(Centro, BorderLayout.CENTER);
        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.LINE_START);
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        pane.add(button, BorderLayout.PAGE_END);
        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.LINE_END);
        frame.setVisible(true);
    }
}