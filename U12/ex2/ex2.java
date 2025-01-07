package ex2;

import java.sql.*;
import java.util.Scanner;

public class ex2 {
    static Connection connection;

    public static void main(String[] args) {
        try {
            String urlBaseDeDatoString = "jdbc:mysql://localhost:3306/instituto";
            String usuari = "root";
            String password = "";

            connection = DriverManager.getConnection(urlBaseDeDatoString, usuari, password);
            System.out.println("Conexión a la base de datos establecida.");
            System.out.println();

            createTables();

            int op = 0;
            do {
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1/Crear Alumno");
                System.out.println("2/Crear Profesor");
                System.out.println("3/Salir");
                Scanner lector = new Scanner(System.in);
                op = lector.nextInt();

                if (op == 1) {
                    CrearAlumno();

                } else if (op == 2) {
                    CrearProfesor();
                } else if (op < 0 || op > 3) {
                    System.out.println("Opción inválida.");
                }
                System.out.println();
            } while (op != 3);

            System.out.println("Programa finalizado.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void createTables() {
        try {
            Statement statement = connection.createStatement();

            // Crear tabla alumnos si no existe
            String createAlumnosTableQuery = "CREATE TABLE IF NOT EXISTS alumnos (nombre VARCHAR(50), dni VARCHAR(10), edad INT, nivel VARCHAR(20))";
            statement.executeUpdate(createAlumnosTableQuery);

            // Crear tabla profesores si no existe
            String createProfesoresTableQuery = "CREATE TABLE IF NOT EXISTS profesores (nombre VARCHAR(50), dni VARCHAR(10), edad INT, asignatura VARCHAR(50))";
            statement.executeUpdate(createProfesoresTableQuery);

            System.out.println("Tablas creadas con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void CrearAlumno() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre del Alumno:");
        String nombre = lector.next();
        System.out.println("DNI:");
        String dni = lector.next();
        System.out.println("¿Cuántos años tiene?:");
        int edad = lector.nextInt();
        System.out.println("¿Qué curso?:");
        String nivel = lector.next();

        try {
            String query = "INSERT INTO alumnos (nombre, dni, edad, nivel) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, dni);
            statement.setInt(3, edad);
            statement.setString(4, nivel);
            statement.executeUpdate();
            System.out.println("Alumno creado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void CrearProfesor() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre del Profesor:");
        String nombre = lector.next();
        System.out.println("DNI:");
        String dni = lector.next();
        System.out.println("¿Cuántos años tiene?:");
        int edad = lector.nextInt();
        System.out.println("¿De qué asignatura es profesor?:");
        String asignatura = lector.next();

        try {
            String query = "INSERT INTO profesores (nombre, dni, edad, asignatura) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nombre);
            statement.setString(2, dni);
            statement.setInt(3, edad);
            statement.setString(4, asignatura);
            statement.executeUpdate();
            System.out.println("Profesor creado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
