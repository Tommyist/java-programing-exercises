import java.awt.FlowLayout;
import javax.swing.*;

public class SwingCounter {
    public static void main(String[] args) {
        // Crear finestra
        JFrame finestra = new JFrame("Exemple de FlowLayout");
        finestra.setSize(500, 100);
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear components
        JLabel nomLabel = new JLabel("Counter:");
        JTextField nomField = new JTextField(10);

        JRadioButton BotoUp = new JRadioButton("Up");
        JRadioButton BotoDown = new JRadioButton("Down");
        ButtonGroup Group = new ButtonGroup();
        JButton Count = new JButton("Count");
        Group.add(BotoUp);
        Group.add(BotoDown);
        
        JLabel idiomaLabel = new JLabel("Step:");
        String[] nums = {"1", "2", "3", "4","5","6"};
        JComboBox<String> Nombres = new JComboBox<String>(nums);

        // Afegir components al contenidor
        finestra.setLayout(new FlowLayout());
        finestra.add(nomLabel);
        finestra.add(nomField);
        finestra.add(BotoUp);
        finestra.add(BotoDown);
        finestra.add(idiomaLabel);
        finestra.add(Nombres);
        finestra.add(Count);
        // Mostrar finestra
        finestra.setVisible(true);
    }
}
