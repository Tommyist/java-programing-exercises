package ex3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class ex3 extends JFrame {

    private JPanel contentPane;
    private Connection connection;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ex3 frame = new ex3();
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
    public ex3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 553, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(64, 90, 396, 248);
        contentPane.add(textArea);

        JButton btnMostraPersones = new JButton("Mostrar Persones");
        btnMostraPersones.setBounds(23, 40, 140, 21);
        btnMostraPersones.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPersones(textArea);
            }

        });
        contentPane.add(btnMostraPersones);

        JButton btnMostrarAlumne = new JButton("Mostrar Alumne");
        btnMostrarAlumne.setBounds(195, 40, 140, 21);
        btnMostrarAlumne.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarAlumnes(textArea);
            }
        });
        contentPane.add(btnMostrarAlumne);

        JButton btnMostrarProfessor = new JButton("Mostrar Professor");
        btnMostrarProfessor.setBounds(375, 40, 140, 21);
        btnMostrarProfessor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarProfessors(textArea);
            }

        });
        contentPane.add(btnMostrarProfessor);

        // Establecer la conexión a la base de datos
        try {
            String urlBaseDeDatoString = "jdbc:mysql://localhost:3306/instituto";
            String usuari = "root";
            String password = "";

            connection = DriverManager.getConnection(urlBaseDeDatoString, usuari, password);
            System.out.println("Conexión a la base de datos establecida.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarPersones(JTextArea textArea) {
        try {
            String queryAlumnes = "SELECT * FROM alumnos";
            PreparedStatement statementAlumnes = connection.prepareStatement(queryAlumnes);
            ResultSet resultSetAlumnes = statementAlumnes.executeQuery();

            String queryProfessors = "SELECT * FROM profesores";
            PreparedStatement statementProfessors = connection.prepareStatement(queryProfessors);
            ResultSet resultSetProfessors = statementProfessors.executeQuery();

            StringBuilder stringBuilder = new StringBuilder();
            
            stringBuilder.append("Alumnes:\n");
            while (resultSetAlumnes.next()) {
                String nom = resultSetAlumnes.getString("nombre");
                String dni = resultSetAlumnes.getString("dni");
                int edat = resultSetAlumnes.getInt("edad");
                String curs = resultSetAlumnes.getString("nivel");

                stringBuilder.append("Nom: ").append(nom).append(", DNI: ").append(dni).append(", Edat: ")
                        .append(edat).append(", Curs: ").append(curs).append("\n");
            }

            stringBuilder.append("\nProfessors:\n");
            while (resultSetProfessors.next()) {
                String nom = resultSetProfessors.getString("nombre");
                String dni = resultSetProfessors.getString("dni");
                int edat = resultSetProfessors.getInt("edad");
                String especialitat = resultSetProfessors.getString("asignatura");

                stringBuilder.append("Nom: ").append(nom).append(", DNI: ").append(dni).append(", Edat: ")
                        .append(edat).append(", Especialitat: ").append(especialitat).append("\n");
            }

            textArea.setText(stringBuilder.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void mostrarAlumnes(JTextArea textArea) {
        try {
            String query = "SELECT * FROM alumnos";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            StringBuilder stringBuilder = new StringBuilder();
            while (resultSet.next()) {
                String nom = resultSet.getString("nombre");
                String dni = resultSet.getString("dni");
                int edat = resultSet.getInt("edad");
                String curs = resultSet.getString("nivel");

                stringBuilder.append("Nom: ").append(nom).append(", DNI: ").append(dni).append(", Edat: ")
                        .append(edat).append(", Curs: ").append(curs).append("\n");
            }

            textArea.setText(stringBuilder.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarProfessors(JTextArea textArea) {
        try {
            String query = "SELECT * FROM profesores";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            StringBuilder stringBuilder = new StringBuilder();
            while (resultSet.next()) {
                String nom = resultSet.getString("nombre");
                String dni = resultSet.getString("dni");
                int edat = resultSet.getInt("edad");
                String especialitat = resultSet.getString("asignatura");

                stringBuilder.append("Nom: ").append(nom).append(", DNI: ").append(dni).append(", Edat: ")
                        .append(edat).append(", Especialitat: ").append(especialitat).append("\n");
            }

            textArea.setText(stringBuilder.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
