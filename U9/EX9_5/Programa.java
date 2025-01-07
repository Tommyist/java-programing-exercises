package EX9_5;

import EX6_12.Persona;

import java.util.Scanner;
import java.util.LinkedList;

public class Programa {
    public static LinkedList<Persona> Cua = new LinkedList<Persona>();
    public static Scanner lector = new Scanner(System.in);
    public static int op = 0;
    public static int PersonasDinsLaCua = 0;

    public static void main(String[] args) {
        do {
            System.out.println("1 / Afegir Persona");
            System.out.println("2 / Llevar Persona");
            System.out.println("3 / Mostar Personas");
            System.out.println("4 / Sortir");
            op = lector.nextInt();

            if (op == 1) {
                PossarPersona();
            }
            if (op == 2) {
                LlevarPersona();
            }
            if (op == 3) {
                Mostrar();
            }
            if(op==0 || op <= 5) {
                throw new RuntimeException("Opcio invalida");
            }
        } while (op != 4);
        System.out.println("Has sortit del programa");
    }

    public static void PossarPersona() {
        System.out.println("Nom");
        String Nom = lector.next();
        System.out.println("Cognom");
        String Cognom = lector.next();
        System.out.println("Edad");
        int edad = lector.nextInt();

        Cua.add(new Persona(Nom, Cognom, edad));
        PersonasDinsLaCua++;
    }

    public static void LlevarPersona() {
        System.out.println("Quina persona vols llevar (introdueix el nom)");
        String BorrarPersona = lector.next();

        boolean personaLlevada = false;
        for (Persona p : Cua) {
            if (p.getNom().equals(BorrarPersona)) {
                Cua.remove(p);
                personaLlevada = true;
                System.out.println("Has llevat a la persona");
                break;
            }
        }
        if (!personaLlevada) {
            System.out.println("No s'ha trobat la persona a la cua.");
        }
    }

    public static void Mostrar() {
        for (Persona p : Cua) {
            System.out.println(p.MostrarPersona());
        }
    }
}