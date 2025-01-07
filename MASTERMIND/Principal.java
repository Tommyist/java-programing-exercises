package MASTERMINDGRAFICO;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldNomUsuari;
    private JTextArea textArea;
    private Partida partida;
    private static final String PARTIDA_FILE = "partida.dat";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal frame = new Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Principal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 836, 649);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitol = new JLabel("MASTERMIND");
        lblTitol.setFont(new Font("Tahoma", Font.PLAIN, 45));
        lblTitol.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitol.setBounds(10, 11, 288, 41);
        contentPane.add(lblTitol);

        JLabel lblNomUsuari = new JLabel("Nombre del usuario : ");
        lblNomUsuari.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNomUsuari.setHorizontalAlignment(SwingConstants.LEFT);
        lblNomUsuari.setBounds(31, 118, 159, 13);
        contentPane.add(lblNomUsuari);

        textFieldNomUsuari = new JTextField();
        textFieldNomUsuari.setBounds(31, 135, 159, 19);
        contentPane.add(textFieldNomUsuari);
        textFieldNomUsuari.setColumns(10);

        JButton btnJugar = new JButton("Jugar");
        btnJugar.setBounds(31, 164, 159, 21);
        contentPane.add(btnJugar);

        textArea = new JTextArea();
        textArea.setBounds(322, 33, 477, 544);
        contentPane.add(textArea);

        JLabel lblPartidasAnteriores = new JLabel("Tiradas Anteriores");
        lblPartidasAnteriores.setHorizontalAlignment(SwingConstants.CENTER);
        lblPartidasAnteriores.setBounds(499, 11, 178, 13);
        contentPane.add(lblPartidasAnteriores);

        // Cargar las partidas anteriores
        cargarPartidas();

        // Mostrar la clasificación de las partidas
        JMenuItem menuItemMostrarPartidas = new JMenuItem("Mostrar Partidas Anteriores");
        menuItemMostrarPartidas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPartidas();
            }
        });

        // Guardar la partida actual
        JMenuItem menuItemGuardarPartida = new JMenuItem("Guardar Partida");
        menuItemGuardarPartida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarPartida();
            }
        });

        // Crear el menú
        JMenu menu = new JMenu("Partidas");
        menu.add(menuItemMostrarPartidas);
        menu.add(menuItemGuardarPartida);

        // Añadir el menú a la barra de menú
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Acción para el botón "Jugar"
        btnJugar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomUsuari = textFieldNomUsuari.getText();
                if (nomUsuari.isEmpty()) {
                    JOptionPane.showMessageDialog(contentPane, "Introduce el nombre de usuario", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    partida = new Partida();
                    jugar();
                }
            }
        });
    }

    private void cargarPartidas() {
        try {
            File file = new File(PARTIDA_FILE);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                partida = (Partida) ois.readObject();
                ois.close();
                fis.close();
            } else {
                partida = null;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarPartida() {
        if (partida != null) {
            partida.setNom(textFieldNomUsuari.getText()); // Asignar el nombre de usuario a la partida
            try {
                FileOutputStream fos = new FileOutputStream(PARTIDA_FILE);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(partida);
                oos.close();
                fos.close();
                JOptionPane.showMessageDialog(contentPane, "Partida guardada correctamente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(contentPane, "No hay ninguna partida para guardar.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }


    private void mostrarPartidas() {
        if (partida != null) {
            textArea.setText(partida.toString());
        } else {
            JOptionPane.showMessageDialog(contentPane, "No hay partidas anteriores.", "Información",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jugar() {
        String nombreUsuario = textFieldNomUsuari.getText(); // Obtener el nombre de usuario
        textArea.setText("");
        textArea.append("Bienvenid@ a Mastermind, " + nombreUsuario + ". Adivina el codigo secreto de 4 colores en 16 intentos.\n");

        for (int i = 0; i < Partida.Num_Intents; i++) {
            textArea.append("Intent #" + (i + 1) + ":\n");

            char[] intent = pedirIntent();
            int[] resultat = partida.EvaluacioCodi(intent);
            mostrarResultat(resultat);

            if (resultat[0] == Partida.Longitut) {
                textArea.append("¡Has adivinat el codi!\n");
                return;
            }
        }

        textArea.append("Has fallat tots els teus intents. El codi era:\n");
        imprimirCodi();
    }

    private char[] pedirIntent() {
        char[] intent = new char[Partida.Longitut];
        String colorsPermesos = "R/G/B/M/Y/C";

        for (int i = 0; i < Partida.Longitut; i++) {
            String input = JOptionPane.showInputDialog(contentPane,
                    "Introdueix el color #" + (i + 1) + " (" + colorsPermesos + "):");

            if (input == null) {
                // El usuario ha cancelado el diálogo
                System.exit(0);
            }

            if (input.length() == 1 && colorsPermesos.indexOf(input.toUpperCase()) != -1) {
                intent[i] = input.toUpperCase().charAt(0);
            } else {
                JOptionPane.showMessageDialog(contentPane, "Color invàlid.", "Error", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }

        return intent;
    }

    private void mostrarResultat(int[] resultat) {
        textArea.append("Resultat del intent: " + resultat[0] + " en la posició correcta, " + resultat[1]
                + " en posició incorrecta.\n");
    }

    private void imprimirCodi() {
        for (int i = 0; i < Partida.Longitut; i++) {
            textArea.append(partida.getCodiSecret()[i] + " ");
        }
        textArea.append("\n");
    }

}
