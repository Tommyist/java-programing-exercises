package ex1;

import java.sql.*;

public class ex1 {

	public static void main(String[] args) {

		String urlBaseDeDatoString = "jdbc:mysql://localhost:3306/provaJava";

		String usuari = "root";

		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection connection = DriverManager.getConnection(urlBaseDeDatoString, usuari, password);
			java.sql.Statement stmt = connection.createStatement();
			ResultSet rSet = stmt.executeQuery("SELECT * FROM peliculas");
			while (rSet.next()) {
				System.out.println(rSet.getString("codi") + " " + rSet.getString("titol") + " " + rSet.getString("genere"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
