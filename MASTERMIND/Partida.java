package MASTERMINDGRAFICO;

import java.util.*;
import java.io.*;

public class Partida implements Serializable {
    static final int Longitut = 4;
    static final int Num_Intents = 16;
    private static final char[] Colors = {'R', 'G', 'B', 'M', 'Y', 'C'};
    private static final ArrayList<Tirada> Tiradas = new ArrayList<>();
    private String nom;
    static Scanner scanner = new Scanner(System.in);
    private char[] CodiSecret;
    private char[][] Intents;

    public Partida() {
        CodiSecret = GenerarCodi();
        Intents = new char[Num_Intents][Longitut];
    }

    public void jugar() {
        System.out.println("com et dius?");
        nom = scanner.next();
        System.out.println("Benvingut a Mastermind. Adivina el codi secret de " + Longitut + " colors en " + Num_Intents + " intets.");
        for (int i = 0; i < Num_Intents; i++) {
            System.out.println("Intent#" + (i + 1) + ":");
            char[] intent = ProbarIntent();
            int[] resultat = EvaluacioCodi(intent);
            MostrarResultat(resultat);
            Intents[i] = intent;
            if (resultat[0] == Longitut) {
                System.out.println("¡Has adivinat el codi");
                System.out.println(Tiradas);
                return;
            }
        }
        System.out.println("Has fallat tots els teus intents " + Num_Intents + "  El codi era:");
        ImprimirCodi();
    }

    private char[] GenerarCodi() {
        if (Longitut > Colors.length) {
            throw new IllegalArgumentException();
        }
        char[] codi = new char[Longitut];
        Random random = new Random();
        for (int i = 0; i < Longitut; i++) {
            codi[i] = Colors[random.nextInt(Colors.length)];
        }
        return codi;
    }

    private char[] ProbarIntent() {
        char[] intent = new char[Longitut];
        for (int i = 0; i < Longitut; i++) {
            System.out.print("Introdueix el color  #" + (i + 1) + " (R/G/B/M/Y/C): ");
            intent[i] = scanner.next().charAt(0);
            while (!ValidarColor(intent[i])) {
                intent[i] = scanner.next().charAt(0);
                System.out.print("ERROR, introdueix un altre color  #" + (i + 1) + " (R/G/B/M/Y/C): ");
            }
        }
        return intent;
    }

    private boolean ValidarColor(char color) {
        for (char c : Colors) {
            if (c == color) {
                return true;
            }
        }
        return false;
    }
    int[] EvaluacioCodi(char[] Intent) {
        if (Intent.length != Longitut) {
            throw new IllegalArgumentException();
        }
        int[] resultat = new int[2];
        boolean[] CodiSecretEmprat = new boolean[Longitut];
        boolean[] IntentEmprat = new boolean[Longitut];
        int Punts =0;
       for (int i = 0; i < Longitut; i++) { //Correcte
            if (Intent[i] == CodiSecret[i]) {
                resultat[0]++;
                CodiSecretEmprat[i] = true;
                IntentEmprat[i] = true;
                Punts=Punts +2;
            }
        }
        Tiradas.add(new Tirada(nom,Punts));
      for (int i = 0; i < Longitut; i++) { // Incorrecte
            if (!CodiSecretEmprat[i]) {
                for (int j = 0; j < Longitut; j++) {
                    if (!IntentEmprat[j] && Intent[j] == CodiSecret[i]) {
                        resultat[1]++;
                        CodiSecretEmprat[i] = true;
                        IntentEmprat[j] = true;
                        break;
                    }
                }
            }
        }
        return resultat;
    }

    private void MostrarResultat(int[] resultado) {
        System.out.println("Resultat del intent : " + resultado[0] + " en la posició correcta, " + resultado[1] + " en posició incorrecta.");
        Tirada ultimaTirada = Tiradas.get(Tiradas.size() - 1);
        System.out.println("Última tirada: " + ultimaTirada);
    }

    private void ImprimirCodi() {
        for (int i = 0; i < Longitut; i++) {
            System.out.print(CodiSecret[i] + " ");
        }
        System.out.println();
    }
 
    @Override
    public String toString() {
        return "Partida [NomUsuari=" + nom + ", Intents=" + Tiradas + "]";
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }


	public String[] getCodiSecret() {
	    String[] codiSecret = new String[Longitut];
	    for (int i = 0; i < Longitut; i++) {
	        codiSecret[i] = String.valueOf(CodiSecret[i]);
	    }
	    return codiSecret;
	}



    }


