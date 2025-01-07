package EX9_4;

import java.util.*;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String [] args) {
        LinkedList<String> Colors; Colors = new LinkedList<String>();
        Colors.add("Negro");
        Colors.add("Blanco");
        Colors.add("Naranja");

        // Recorre els elements d'una LinkedList
        for (String Mostra : Colors) {
            System.out.println(Mostra);
        }
        // Recorre tots els elements començant per una posicio especifica
        ListIterator<String> iterador = Colors.listIterator(1); // Comença a la segona posició

        while (iterador.hasNext()) {
            String element = iterador.next();
            System.out.println(element);
        }
        // Itera una LikedList
        Iterator<String> iter = Colors.iterator();
        while(iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
        // Inseriu una LinkedList amb order invers
        LinkedList<String> llistaInversa = new LinkedList<>();
        for (int i = Colors.size() - 1; i >= 0; i--) {
            llistaInversa.add(Colors.get(i));
        }
        System.out.println("Llista inversa: " + llistaInversa);

        // Inscriu elements a la LinkedList a la primera i ultima posicio
        Colors.addFirst("Primer element");
        Colors.addLast("Ultim element");

        // Inseriu l'element especificat al final d'una LinkedList
        Colors.offerLast("Nou últim element");
        // Inseriu alguns elements a la posicio especificada d'una LinkedList
        Colors.add(1, "Taronja");
        Colors.add(2, "Turquesa");
        // Obteniu la primera i l'utlima ocurrencia dels elements especificats
            //Obtenir primera ocurrència
        int firstIndex = Colors.indexOf("Vermell");

            //Obtenir última ocurrència
        int lastIndex = Colors.lastIndexOf("Blau");
        // Mostra els elements i les seves posicions en una LinkedList
        for (int i = 0; i < Colors.size(); i++) {
            System.out.println("Posició: " + i + " Element: " + Colors.get(i));
        }
        // Elimina un element especifica d'una LinkedList
        Colors.remove("Negre");
        // Elimina el primer i ultim element d'una LinkedList
        Colors.removeFirst();
        Colors.removeLast();
        // Elimina tots els elements d'una LinkedList
        Colors.clear();
        // Canvia Elements en una LinkedList
        Colors.add("Vermell");
        Colors.set(0,"Cian");
        // Barreja els elements d'una LinkedList
        Collections.shuffle(Colors);
        // Uniu dues LinkedLists

        LinkedList<String> ColorsComplementaris = new LinkedList<String>();
        ColorsComplementaris.add("Verd Groguenc");
        ColorsComplementaris.add("Blau Ultramar");

        Colors.addAll(ColorsComplementaris);
        // Clona una LinkedList a una altre LinkedList
        LinkedList<String> ColorClonats = (LinkedList<String>) Colors.clone();
        // Elimina i torna el primer element d'una LinkedList
        String PrimerColor = Colors.poll();
        // Recupera, pero no elimina, el primer element d'una LinkedList
        String PrimerColorv2 = Colors.peek();
        // Recupera, pero no elimina, el darrer element d'una LinkedList
        String UltimColor = Colors.peekLast();
        // Comproveu si un element concret Existeix en una LinkedList
        System.out.println(Colors.contains("Blau Ultramar")); // true
        System.out.println(Colors.contains("X")); // false
        // Converteix una LinkedList en una ArrayList
        ArrayList<String> llistaArray = new ArrayList<String>();
        llistaArray.addAll(Colors);

        System.out.println(llistaArray); // [1, 2, 3]
        // Compara dues LinkedLists

        LinkedList<Integer> llista1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> llista2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> llista3 = new LinkedList<>(Arrays.asList(4, 5, 6));

        System.out.println(llista1.equals(llista2)); // true
        System.out.println(llista1.equals(llista3)); // false

        // Comprovar que una LinkedList esta buida o no
        Colors.clear();
        System.out.println(Colors.isEmpty()); // true
        Colors.add("Negre");
        System.out.println(Colors.isEmpty()); // false
        // Substituiu un element d'una LinkedList
        System.out.println(Colors);

        Colors.set(0, "Vermell");
        System.out.println(Colors);
    }
}

