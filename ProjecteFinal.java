package ProjecteFinal;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.*;

public class ProjecteFinal {
	private static JTextField textField;
	private static JPasswordField passwordField;
	private static JTextField textField_1;
	private static JPasswordField passwordField_1;
	private static String urlDB = "jdbc:mysql://localhost:3306/libreriaj";
	private static String username = "root";
	private static String password = "";
	private static JTextField idLibros;

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		try {
			Connection Server = DriverManager.getConnection(url, username, password);
			System.out.println("Conexión al servidor de base de datos establecida.");

			String createDB = "CREATE DATABASE IF NOT EXISTS libreriaj";
			Statement createDBStatement = Server.createStatement();
			createDBStatement.executeUpdate(createDB);
			createDBStatement.close();

			Connection connectionDB = DriverManager.getConnection(urlDB, username, password);
			System.out.println("Conexión a la base de datos establecida.");
			// Crear la tabla Usuarios
			String createUsuariosTable = "CREATE TABLE IF NOT EXISTS Usuarios ("
					+ "userid INT AUTO_INCREMENT PRIMARY KEY," + "nombreUsuario VARCHAR(255) NOT NULL,"
					+ "contrasena VARCHAR(255) NOT NULL" + ")";
			Statement usuariosStatement = connectionDB.createStatement();
			usuariosStatement.executeUpdate(createUsuariosTable);
			usuariosStatement.close();
			// Crear la tabla Libros
			String createLibrosTable = "CREATE TABLE IF NOT EXISTS Libros (" + "libroid INT AUTO_INCREMENT PRIMARY KEY,"
					+ "titulo VARCHAR(255) NOT NULL," + "genero VARCHAR(255) NOT NULL,"
					+ "precio DECIMAL(10,2) NOT NULL" + ")";
			Statement librosStatement = connectionDB.createStatement();
			librosStatement.executeUpdate(createLibrosTable);
			librosStatement.close();
			// Crear la tabla Carrito
			String createCarritoTable = "CREATE TABLE IF NOT EXISTS Carrito (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
					+ "usuario INT NOT NULL," + "libro INT NOT NULL,"
					+ "FOREIGN KEY (usuario) REFERENCES Usuarios (userid),"
					+ "FOREIGN KEY (libro) REFERENCES Libros (libroid)" + ")";
			Statement carritoStatement = connectionDB.createStatement();
			carritoStatement.executeUpdate(createCarritoTable);
			carritoStatement.close();

			// Insertar datos en la tabla Libros
			String insertLibros = "INSERT INTO Libros (libroid, titulo, genero, precio) VALUES "
					+ "(1, 'El Gran Gatsby', 'Novela', 19.99), " + "(2, '1984', 'Ciencia Ficción', 15.99), "
					+ "(3, 'Orgullo y prejuicio', 'Romance', 12.99), "
					+ "(4, 'Don Quijote de la Mancha', 'Clásico', 25.99), "
					+ "(5, 'Cien años de soledad', 'Realismo mágico', 18.99), "
					+ "(6, 'El señor de los anillos', 'Fantasía', 22.99), "
					+ "(7, 'Harry Potter y la piedra filosofal', 'Fantasía', 16.99), "
					+ "(8, 'Matar a un ruiseñor', 'Drama', 14.99), "
					+ "(9, 'Crónica de una muerte anunciada', 'Ficción', 11.99), "
					+ "(10, 'Las aventuras de Tom Sawyer', 'Aventura', 13.99), "
					+ "(11, 'El alquimista', 'Ficción', 10.99), " + "(12, 'Moby Dick', 'Aventura', 21.99), "
					+ "(13, 'Los miserables', 'Drama', 17.99), " + "(14, 'El código Da Vinci', 'Suspense', 19.99), "
					+ "(15, 'El nombre de la rosa', 'Misterio', 16.99)";
			Statement insertStatement = connectionDB.createStatement();
			insertStatement.executeUpdate(insertLibros);
			insertStatement.close();
			connectionDB.close();
			System.out.println("Conexión al servidor de base de datos cerrada.");
		} catch (SQLException e) {
			System.out.println("Error al conectar al servidor de base de datos: " + e.getMessage());
		}

		JFrame frame = new JFrame("Libreria");
		JPanel panel = (JPanel) frame.getContentPane();
		JPanel cards = new JPanel(new CardLayout());
		CardLayout cl = (CardLayout) cards.getLayout();

		JPanel Principal = new JPanel();

		cards.add(Principal, "PanelBuid");
		Principal.setLayout(null);

		JButton btnLogin = new JButton("Iniciar Sesion");
		btnLogin.setBounds(32, 171, 121, 35);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "name_956577205805300");
			}

		});
		Principal.add(btnLogin);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(409, 171, 121, 35);
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "name_956552941852700");
			}
		});
		Principal.add(btnRegistrar);

		JLabel lblTitulo = new JLabel("Libreria");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblTitulo.setBounds(167, 22, 229, 54);
		Principal.add(lblTitulo);

		JLabel lblNewLabel_3 = new JLabel("Joan Saura DAW 2023");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(163, 181, 236, 14);
		Principal.add(lblNewLabel_3);

		panel.add(cards);

		Panel Registro = new Panel();
		cards.add(Registro, "name_956552941852700");
		Registro.setLayout(null);

		JLabel lblTituloRegistro = new JLabel("Registro");
		lblTituloRegistro.setBounds(225, 5, 125, 41);
		lblTituloRegistro.setFont(new Font("Tahoma", Font.PLAIN, 34));
		Registro.add(lblTituloRegistro);

		textField = new JTextField();
		textField.setBounds(225, 80, 125, 19);
		Registro.add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setBounds(78, 152, 159, 13);
		Registro.add(lblPassword);

		JLabel lblNewLabel = new JLabel("Nombre de Usuario : ");
		lblNewLabel.setBounds(78, 83, 159, 13);
		Registro.add(lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(225, 148, 125, 19);
		Registro.add(passwordField);

		Button button = new Button("Registrar");
		button.setActionCommand("Registrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreUsuario = textField.getText();
				String contrasena = new String(passwordField.getPassword());

				try {
					Connection connection = DriverManager.getConnection(urlDB, username, password);
					// Insertar usuario en la tabla Usuarios
					String insertUsuarioQuery = "INSERT INTO Usuarios (nombreUsuario, contrasena) VALUES (?, ?)";
					PreparedStatement insertUsuarioStatement = connection.prepareStatement(insertUsuarioQuery);
					insertUsuarioStatement.setString(1, nombreUsuario);
					insertUsuarioStatement.setString(2, contrasena);
					insertUsuarioStatement.executeUpdate();
					insertUsuarioStatement.close();
					connection.close();
					JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");				
					} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		});
		button.setBounds(246, 219, 78, 21);
		Registro.add(button);

		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(10, 235, 119, 21);
		btnAtras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "PanelBuid");
			}
		});
		Registro.add(btnAtras);

		Panel Login = new Panel();
		cards.add(Login, "name_956577205805300");
		Login.setLayout(null);

		JButton btnAtras_1 = new JButton("Atras");
		btnAtras_1.setBounds(10, 235, 113, 21);
		btnAtras_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "PanelBuid");
			}
		});
		Login.add(btnAtras_1);

		JLabel lblLogin = new JLabel("Registro");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblLogin.setBounds(216, 10, 125, 41);
		Login.add(lblLogin);

		JLabel lblUsernameLI = new JLabel("Nombre de Usuario : ");
		lblUsernameLI.setBounds(83, 87, 192, 13);
		Login.add(lblUsernameLI);

		textField_1 = new JTextField();
		textField_1.setBounds(227, 84, 114, 19);
		Login.add(textField_1);
		textField_1.setColumns(10);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(227, 159, 114, 19);
		Login.add(passwordField_1);

		JButton btnLogIn = new JButton("Inicar");
		btnLogIn.setBounds(240, 235, 85, 21);
		btnLogIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombreUsuario = textField_1.getText();
				String contrasena = new String(passwordField_1.getPassword());
				try {
					Connection connection = DriverManager.getConnection(urlDB, username, password);
					// Verificar usuario y contraseña en la tabla Usuarios
					String verificarUsuarioQuery = "SELECT * FROM Usuarios WHERE nombreUsuario = ? AND contrasena = ?";
					PreparedStatement verificarUsuarioStatement = connection.prepareStatement(verificarUsuarioQuery);
					verificarUsuarioStatement.setString(1, nombreUsuario);
					verificarUsuarioStatement.setString(2, contrasena);
					ResultSet resultSet = verificarUsuarioStatement.executeQuery();
					if (resultSet.next()) {
						// Usuario y contraseña coinciden, pasar al panel MenuLogeado
						cl.show(cards, "name_83091832143300");
					} else {
						// Usuario y contraseña no coinciden, mostrar mensaje de error
						 JOptionPane.showMessageDialog(null, "Credenciales incorrectas",
							      "Error!", JOptionPane.ERROR_MESSAGE);						
					}
					verificarUsuarioStatement.close();
					connection.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		});
		Login.add(btnLogIn);

		JLabel lblPaswordLG = new JLabel("Contraseña : ");
		lblPaswordLG.setBounds(83, 163, 171, 13);
		Login.add(lblPaswordLG);

		JPanel MenuLogeado = new JPanel();
		cards.add(MenuLogeado, "name_83091832143300");
		MenuLogeado.setLayout(null);

		JLabel lbBienvenido = new JLabel("BIENVENIDO/A ");
		lbBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lbBienvenido.setBounds(182, 5, 230, 41);
		MenuLogeado.add(lbBienvenido);
		JPanel Libros = new JPanel();
		Libros.setBounds(33, 67, 214, 134);

		JTextPane ListaLibro = new JTextPane();
		ListaLibro.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ListaLibro.setBounds(20, 31, 543, 182);

		JButton btnNewButton = new JButton("Comprar libros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "name_83769039160100");
				try {
					Connection connectionDB = DriverManager.getConnection(urlDB, username, password);
					System.out.println("Conexión a la base de datos establecida.");
					// Realizar una consulta SELECT para obtener todos los libros
					String selectQuery = "SELECT * FROM Libros";
					Statement selectStatement = connectionDB.createStatement();
					ResultSet resultSet = selectStatement.executeQuery(selectQuery);
					// Construir una cadena con la información de los libros
					StringBuilder librosInfo = new StringBuilder();
					while (resultSet.next()) {
						int libroid = resultSet.getInt("libroid");
						String titulo = resultSet.getString("titulo");
						String genero = resultSet.getString("genero");
						double precio = resultSet.getDouble("precio");
						librosInfo.append("ID: ").append(libroid).append(", Título: ").append(titulo)
								.append(", Género: ").append(genero).append(", Precio: ").append(precio).append("\n");
					}
					// Establecer la cadena de información de los libros en el JTextArea
					ListaLibro.setText(librosInfo.toString());
					resultSet.close();
					selectStatement.close();
					connectionDB.close();
				} catch (SQLException x) {
					x.printStackTrace();
				}
			}

		});
		btnNewButton.setBounds(10, 232, 127, 21);
		MenuLogeado.add(btnNewButton);

		JTextPane MostrarCarrito = new JTextPane();
		MostrarCarrito.setFont(new Font("Tahoma", Font.PLAIN, 9));
		MostrarCarrito.setBounds(31, 47, 491, 166);

		JLabel lblTotalPrecio = new JLabel("TOTAL : ");
		lblTotalPrecio.setBounds(297, 228, 115, 13);

		JButton btnVerCarrito = new JButton("Ver carrito");
		btnVerCarrito.setBounds(436, 232, 127, 21);
		btnVerCarrito.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "name_83780565421400");
				String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");

				try {
					Connection connectionDB = DriverManager.getConnection(urlDB, username, password);
					System.out.println("Conexión a la base de datos establecida.");

					// Obtener el ID del usuario en base a su nombre de usuario
					String obtenerIdUsuarioQuery = "SELECT userid FROM Usuarios WHERE nombreUsuario = ?";
					PreparedStatement obtenerIdUsuarioStatement = connectionDB.prepareStatement(obtenerIdUsuarioQuery);
					obtenerIdUsuarioStatement.setString(1, nombreUsuario);
					ResultSet obtenerIdUsuarioResultSet = obtenerIdUsuarioStatement.executeQuery();

					if (obtenerIdUsuarioResultSet.next()) {
						int userId = obtenerIdUsuarioResultSet.getInt("userid");

						// Obtener la información de los libros en el carrito para el usuario
						String carritoQuery = "SELECT l.* FROM carrito c INNER JOIN Libros l ON c.libro = l.libroid WHERE c.usuario = ?";
						PreparedStatement carritoStatement = connectionDB.prepareStatement(carritoQuery);
						carritoStatement.setInt(1, userId);
						ResultSet carritoResultSet = carritoStatement.executeQuery();

						// Construir el contenido a mostrar en el JTextPane
						StringBuilder contenido = new StringBuilder();
						while (carritoResultSet.next()) {
							int libroId = carritoResultSet.getInt("libroid");
							String titulo = carritoResultSet.getString("titulo");
							String autor = carritoResultSet.getString("genero");
							// Otros campos del libro

							// Agregar la información del libro al contenido
							contenido.append("ID: ").append(libroId).append("\n");
							contenido.append("Título: ").append(titulo).append("\n");
							contenido.append("Genero : ").append(autor).append("\n");
							// Agregar otros campos del libro

							contenido.append("\n"); // Separador entre libros
						}

						// Mostrar el contenido en el JTextPane
						MostrarCarrito.setText(contenido.toString());

						carritoResultSet.close();
						carritoStatement.close();

						// Obtener el precio total de los libros en el carrito
						String precioTotalQuery = "SELECT SUM(precio) AS total FROM Libros WHERE libroid IN (SELECT libro FROM carrito WHERE usuario = ?)";
						PreparedStatement precioTotalStatement = connectionDB.prepareStatement(precioTotalQuery);
						precioTotalStatement.setInt(1, userId);
						ResultSet precioTotalResultSet = precioTotalStatement.executeQuery();

						double precioTotal = 0.0;

						if (precioTotalResultSet.next()) {
							precioTotal = precioTotalResultSet.getDouble("total");
						}

						precioTotalResultSet.close();
						precioTotalStatement.close();

						// Actualizar el label total con el precio total
						lblTotalPrecio.setText("Total: $" + precioTotal);

					} else {
						System.out.println("Nombre de usuario no encontrado.");
					}

					obtenerIdUsuarioResultSet.close();
					obtenerIdUsuarioStatement.close();
					connectionDB.close();
				} catch (SQLException x) {
					x.printStackTrace();
				}

			}
		});
		MenuLogeado.add(btnVerCarrito);

		JPanel CompraLibros = new JPanel();
		cards.add(CompraLibros, "name_83769039160100");
		CompraLibros.setLayout(null);
		CompraLibros.add(ListaLibro);

		JButton btnAtrasListaLibros = new JButton("Atras");
		btnAtrasListaLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "name_83091832143300");
			}
		});
		btnAtrasListaLibros.setBounds(20, 224, 107, 21);
		CompraLibros.add(btnAtrasListaLibros);

		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Solicitar el nombre de usuario mediante una ventana de diálogo de entrada de
				// texto
				String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");

				try {
					Connection connectionDB = DriverManager.getConnection(urlDB, username, password);
					System.out.println("Conexión a la base de datos establecida.");

					// Obtener el ID del libro ingresado por el usuario
					int libroId = Integer.parseInt(idLibros.getText());
					int librosComprados = 0;

					// Verificar si el libro existe en la tabla "Libros"
					String selectQuery = "SELECT * FROM Libros WHERE libroid = ?";
					PreparedStatement selectStatement = connectionDB.prepareStatement(selectQuery);
					selectStatement.setInt(1, libroId);
					ResultSet resultSet = selectStatement.executeQuery();

					// Verificar si se encontró el libro
					if (resultSet.next()) {
						// Buscar el ID del usuario por su nombre de usuario
						String buscarUsuarioQuery = "SELECT * FROM Usuarios WHERE nombreUsuario = ?";
						PreparedStatement buscarUsuarioStatement = connectionDB.prepareStatement(buscarUsuarioQuery);
						buscarUsuarioStatement.setString(1, nombreUsuario);
						ResultSet usuarioResultSet = buscarUsuarioStatement.executeQuery();

						// Verificar si se encontró el usuario y obtener su ID
						if (usuarioResultSet.next()) {
							int userid = usuarioResultSet.getInt("userid");

							// Insertar el libro y el cliente en la tabla "carrito"
							String insertQuery = "INSERT INTO carrito (usuario, libro) VALUES (?, ?)";
							PreparedStatement insertStatement = connectionDB.prepareStatement(insertQuery);
							insertStatement.setInt(1, userid);
							insertStatement.setInt(2, libroId);
							insertStatement.executeUpdate();

							System.out.println("Libro agregado al carrito correctamente.");
							librosComprados++;
						} else {
							System.out.println("Usuario no encontrado.");
						}

						usuarioResultSet.close();
						buscarUsuarioStatement.close();
					} else {
						System.out.println("El libro con ID " + libroId + " no existe.");
					}

					resultSet.close();
					selectStatement.close();
					connectionDB.close();
				} catch (SQLException | NumberFormatException x) {
					x.printStackTrace();
				}
			}
		});

		btnComprar.setBounds(456, 224, 107, 21);

		CompraLibros.add(btnComprar);

		idLibros = new JTextField();
		idLibros.setBounds(332, 224, 86, 20);
		CompraLibros.add(idLibros);
		idLibros.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Lista de libros");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(146, 11, 268, 20);
		CompraLibros.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Que libro desea ? :");
		lblNewLabel_2.setBounds(200, 227, 171, 14);
		CompraLibros.add(lblNewLabel_2);

		JPanel CarritoCompra = new JPanel();
		cards.add(CarritoCompra, "name_83780565421400");
		CarritoCompra.setLayout(null);

		JLabel lblCarrito = new JLabel("Tu Carrito de la compra");
		lblCarrito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCarrito.setBounds(21, 11, 298, 25);
		CarritoCompra.add(lblCarrito);

		JButton btnNewButton_1 = new JButton("Comprar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");
				try {
					Connection connectionDB = DriverManager.getConnection(urlDB, username, password);
					// Obtener el ID del usuario
					String selectUsuarioQuery = "SELECT userid FROM Usuarios WHERE nombreUsuario = ?";
					PreparedStatement selectUsuarioStatement = connectionDB.prepareStatement(selectUsuarioQuery);
					selectUsuarioStatement.setString(1, nombreUsuario);
					ResultSet usuarioResultSet = selectUsuarioStatement.executeQuery();

					int userId = 0;
					if (usuarioResultSet.next()) {
						userId = usuarioResultSet.getInt("userid");
					}

					// Eliminar los libros del carrito del usuario
					String deleteQuery = "DELETE FROM carrito WHERE usuario = ?";
					PreparedStatement deleteStatement = connectionDB.prepareStatement(deleteQuery);
					deleteStatement.setInt(1, userId);
					int rowsDeleted = deleteStatement.executeUpdate();

					System.out.println(
							rowsDeleted + " registros eliminados del carrito para el usuario con ID: " + userId);

					usuarioResultSet.close();
					selectUsuarioStatement.close();
					deleteStatement.close();
					connectionDB.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

			}
		});
		btnNewButton_1.setBounds(431, 224, 115, 21);
		CarritoCompra.add(btnNewButton_1);

		CarritoCompra.add(lblTotalPrecio);

		JButton btnAtrasCARR = new JButton("Atras");
		btnAtrasCARR.setBounds(10, 224, 160, 21);
		btnAtrasCARR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "name_83091832143300");
			}
		});
		CarritoCompra.add(btnAtrasCARR);

		JLabel PrecioTotal = new JLabel("");
		PrecioTotal.setBounds(342, 227, 46, 14);
		CarritoCompra.add(PrecioTotal);

		CarritoCompra.add(MostrarCarrito);

		JLabel lblListaLibros_1 = new JLabel("Lista de libros disponibles");
		frame.setSize(589, 303);
		frame.setResizable(false);
		frame.setVisible(true);

	}
}
