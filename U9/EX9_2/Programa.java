package EX9_2;

import java.util.HashMap;
import java.util.Scanner;
public class Programa {

    static HashMap <String, Alumne> Alumnat = new HashMap<String, Alumne>(50);
    static HashMap <String, Profesor> Professorat = new HashMap<String, Profesor>(50);
    static int Alumnes=0;
    static int Profesors=0;
    static int op=0;

    public static void main(String[] args) {
        do {
            System.out.println("Que vols fer ?");
            System.out.println("1/Crear Alumne");
            System.out.println("2/Mostrar Alumnes");
            System.out.println("3/Crear Professor");
            System.out.println("4/Mostrar Professors");
            System.out.println("5/Mostrar tots");
            System.out.println("6/Exit");
            Scanner lector = new Scanner(System.in);
            op = lector. nextInt();

            if(op==1) {
                CrearAlumne();
            }
            if(op==2) {
                MostrarAlumne();
            }
            if(op==3) {
                CrearProfessor();
            }
            if(op==4) {
                MostrarProfessor();
            }
            if(op==5) {
                MostrarTots();
            }
            if (op<0 || op>=7) {
                throw new IllegalArgumentException("No existeix la opcio triada");
            }
        }
        while (op!=6) ;
        System.out.println("Programa finalitzat");
    }
    public static void CrearAlumne() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Nom del Alumne");
        String Nom= lector.next();
        System.out.println("DNI");
        String DNI= lector.next();
        System.out.println("Cuant d'anys te?");
        Short Edad= lector.nextShort();
        System.out.println("Que cursa?");
        String Nivel=lector.next();

        Alumnat.put(DNI,new Alumne(Nom,DNI,Edad,Nivel));
        Alumnes++;
    }
    public static void MostrarAlumne() {
        if(Alumnes == 0) {
            throw new IllegalArgumentException("No hi ha alumnes registrats");
        }
        for (int i=0;i<Alumnes;i++) {
            System.out.println(Alumnat.get(i).toString());
        }
    }

    public static void CrearProfessor() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Nom del Professor");
        String Nom= lector.next();
        System.out.println("DNI");
        String DNI= lector.next();
        System.out.println("Cuant d'anys te?");
        Short Edad= lector.nextShort();
        System.out.println("De quina asignatura es professor?");
        String asignatura= lector.next();

        Professorat.put(DNI,new Profesor(Nom,DNI,Edad,asignatura));
        Profesors++;
    }
    public static void MostrarProfessor() {
        if(Profesors == 0) {
            throw new IllegalArgumentException("No hi ha professors registrats");
        }
        for (int i=0;i<Profesors;i++) {
            System.out.println(Professorat.get(i).toString());
        }
    }
    public static void MostrarTots() {
        if(Alumnes == 0 && Profesors == 0) {
            throw new IllegalArgumentException("No hi ha ningun del dos tipus de persona registrats");
        }
        if(Alumnes == 0) {
            throw new IllegalArgumentException("No hi ha alumnes registrats");
        }
        if(Profesors == 0) {
            throw new IllegalArgumentException("No hi ha professors registrats");
        }

        System.out.println("Llista d'alumnes");
        for (int i=0;i<Alumnes;i++) {
            System.out.println(Alumnat.get(i).toString());
        }
        System.out.println("Llista de professors");
        for (int i=0;i<Profesors;i++) {
            System.out.println(Professorat.get(i).toString());
        }
    }

}