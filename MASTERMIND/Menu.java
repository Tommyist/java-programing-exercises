package MASTERMINDGRAFICO;

import java.io.*;
import java.util.*;

public class Menu {

	 static File directori = new File("C:/Users/Saura Tommy/eclipse-workspace/Clase/src/Mastermind/partida.dat");	
	 static Scanner lector = new Scanner(System.in);
	 static ArrayList<Partida> llistat = new ArrayList<Partida>();
	
	
    public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException {
   int menu;
    	do {
   System.out.println("Que vols fer");
   System.out.println("1/ Jugar");
   System.out.println("2/ Mostrar Partidas anteriors");
   System.out.println("3/ Sortir del programa");
  
   menu = lector.nextInt();
   switch(menu) {
   case 1:
	   Partida partida= new Partida();
	   partida.jugar();
	   GuardarPartida(partida);
	   break;
   case 2:
	   MostrarPartidas();
	   break;
   }
   }while(menu!=3);
	   System.out.println("Has sortit del programa");
    }
    public static void GuardarPartida(Partida Partida) throws FileNotFoundException, IOException {
   	 ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(directori));
    oos.writeObject(llistat);
    oos.flush();
    oos.close();
    llistat.add(Partida);
    }
    public static void MostrarPartidas() throws ClassNotFoundException, IOException {
 
    	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(directori))) {
            for(int i =0;i<llistat.size();i++) {
            	System.out.println(llistat.get(i));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: No s'ha trobat l' archiu " + directori);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
            e.printStackTrace(); }
            catch (ClassCastException e) {
            System.out.println("No s'han trobat partides");
        }
    }

    
}

