package EX6_1;

public class Ogg extends Musica{
	public Ogg(double durada) {
		super(durada);
		
	}
	@Override
	public void reproduir() {
		System.out.println("Reproduint OGG");
	}
}
