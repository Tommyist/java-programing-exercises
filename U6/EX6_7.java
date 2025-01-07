package EX6_1;

public class EX6_7 {

	public static void main(String[] args) {
		//Musica mus = new Musica(); //Al hora de intentar compilar hi ha un error del objecte 
										// No es pot fer perque es un objecte d'una clase abstracte
		Mp3 m = new Mp3(1.28);
		m.reproduir();
		
		Ogg o = new Ogg(2.12);
		o.reproduir();
	}

}
