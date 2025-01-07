package EX9_3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
     public static void main(String[] args) {
         // Crear una ArrayList i afegir alguns colors
         ArrayList<String> colors = new ArrayList<>();
         colors.add("Vermell");
         colors.add("Blau");
         colors.add("Verd");
         colors.add("Groc");

         // Imprimir la col·lecció
         System.out.println("Col·lecció de colors: " + colors);

         // Iterar per tots els elements
         for (String color : colors) {
             System.out.println(color);
         }

         // Inserir un element a la primera posició
         colors.add(0, "Negre");
         System.out.println("Col·lecció de colors després d'inserir Negre a la primera posició: " + colors);

         // Recuperar un element (en un índex especificat)
         String tercerColor = colors.get(2);
         System.out.println("El tercer color és: " + tercerColor);

         // Actualitzar un element de matriu específic per un altra element donat
         colors.set(2, "Gris");
         System.out.println("Col·lecció de colors després d'actualitzar el tercer element a Gris: " + colors);

         // Eliminar el tercer element d'una ArrayList
         colors.remove(2);
         System.out.println("Col·lecció de colors després d'eliminar el tercer element: " + colors);

         // Cercar un element en una ArrayList
         boolean conteBlau = colors.contains("Blau");
         System.out.println("La col·lecció de colors conté Blau? " + conteBlau);

         // Ordenar una ArrayList determinada
         Collections.sort(colors);
         System.out.println("Col·lecció de colors ordenada: " + colors);

         // Copiar una ArrayList en una altra. Canviar de posició automàticament (barrejar) elements d'una ArrayList
         ArrayList<String> colors2 = new ArrayList<>(colors);
         Collections.shuffle(colors2);
         System.out.println("Col·lecció de colors original: " + colors);
         System.out.println("Col·lecció de colors2 barrejada: " + colors2);

         // Invertir els elements d'una ArrayList
         Collections.reverse(colors);
         System.out.println("Col·lecció de colors invertida: " + colors);

         // Extreure una part d'una ArrayList
         ArrayList<String> colorsSub = new ArrayList<>(colors.subList(1, 3));
         System.out.println("Col·lecció de colorsSub: " + colorsSub);

         // Comparar dues ArrayLists
         boolean iguals = colors.equals(colors2);
         System.out.println("La col·lecció de colors és igual a la col·lecció de colors2? " + iguals);

         // Intercanviau dos elements en una ArrayList
         Collections.swap(colors, 1, 2);
         System.out.println("Col·lecció de colors després d'intercanviar el segon i el tercer element: " + colors);



         // Creem la segona ArrayList
         ArrayList<String> llista2 = new ArrayList<String>();
         llista2.add("negre");
         llista2.add("blanc");
         llista2.add("gris");
         llista2.add("marró");

         // Unim les dues ArrayLists
         ArrayList<String> llista3 = new ArrayList<String>();
         llista3.addAll(colors);
         llista3.addAll(llista2);

         // Mostrem la llista unida
         System.out.println("Llista unida: " + llista3);

         // Clonem la llista1 en una nova llista
         ArrayList<String> llistaClonada = (ArrayList<String>) colors.clone();

         // Mostrem la llista clonada
         System.out.println("Llista clonada: " + llistaClonada);

         // Buidar una ArrayList
         colors.clear();
         System.out.println("La llista està buida? " + colors.isEmpty());

         // Recrear la llista per a les altres operacions
         colors.add("Verd");
         colors.add("Groc");
         colors.add("Cian");
         colors.add("Verd Fosc");
         colors.add("Lila");

         // Comprovar si una ArrayList està buida o no
         System.out.println("La llista està buida? " + colors.isEmpty()); // Expected output: false

         // Retallar la capacitat d'una ArrayList a la mida de la llista actual
         colors.trimToSize();

         // Augmentar la mida d'una ArrayList
         colors.ensureCapacity(10);

         // Substituir el segon element d'una ArrayList per l'element especificat
         colors.set(1, "Negre");

         // Imprimir tots els elements d'una ArrayList utilitzant la posició dels elements
         for (int i = 0; i < colors.size(); i++) {
             System.out.println(i + ": " + colors.get(i));
         }

     }
}