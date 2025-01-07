
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class calculadora {
    public static void main(String[] args) {
        // Contenidor d'alt nivell: finestra principal
        JFrame calculadora = new JFrame("Calculadora");
        calculadora.setSize(250, 400);
        calculadora.setResizable(false);

        // Crear el JPanel principal y configurar el layout
        JPanel panelPrincipal = new JPanel(new GridLayout(2,1));
        // Crear el JLabel y añadirlo al panel principal en la primera posición
        JLabel Result = new JLabel("Resultat");
        Result.setBorder(new LineBorder(Color.black, 2, false));
        panelPrincipal.add(Result);

        // Panell de contingut
        Container panell = calculadora.getContentPane();
        // Display de la calculadora
        panell.setLayout(new GridLayout());
        // Panell auxiliar on posar els botons
        JPanel panellBotons = new JPanel();
        JButton boto1 = new JButton("1");
        JButton boto2 = new JButton("2");
        JButton boto3 = new JButton("3");
        JButton boto4 = new JButton("4");
        JButton boto5 = new JButton("5");
        JButton boto6 = new JButton("6");
        JButton boto7 = new JButton("7");
        JButton boto8 = new JButton("8");
        JButton boto9 = new JButton("9");
        JButton boto0 = new JButton("0");
        JButton botoC = new JButton("C");
        JButton botomes = new JButton("+");
        JButton botomenys = new JButton("-");
        JButton botomulti = new JButton("*");
        JButton botoDiv = new JButton("/");
        // Afegir botons a panell auxiliar
        panellBotons.add(boto1);
        panellBotons.add(boto2);
        panellBotons.add(boto3);
        panellBotons.add(boto4);
        panellBotons.add(boto5);
        panellBotons.add(boto6);
        panellBotons.add(boto7);
        panellBotons.add(boto8);
        panellBotons.add(boto9);
        panellBotons.add(boto0);
        panellBotons.add(botoC);
        panellBotons.add(botomes);
        panellBotons.add(botomenys);
        panellBotons.add(botomulti);
        panellBotons.add(botoDiv);
        // Afegir panell auxiliar de botons a interface
        panelPrincipal.add(panellBotons);

        // Afegir el panel principal al contenidor de la finestra
        panell.add(panelPrincipal);
        calculadora.setVisible(true);
    }
}
