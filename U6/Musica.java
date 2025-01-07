package EX6_1;

public abstract class Musica {
	private double durada;
	public abstract void reproduir();
	
	public Musica(double durada) {
	this.durada=durada;
	}

	public double getDurada() {
		return durada;
	}

	public void setDurada(double durada) {
		this.durada = durada;
	}
	
	
}
