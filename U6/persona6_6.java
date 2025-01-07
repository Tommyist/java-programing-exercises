package EX6_1;

public class persona6_6 {
	
	String nom;
	String cognoms;
	short edat;

	public persona6_6(String nom,String cognoms,short edat) {
		this.nom=nom;
		this.cognoms=cognoms;
		this.edat=edat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public short getEdat() {
		return edat;
	}

	public void setEdat(short edat) {
		this.edat = edat;
	}
	
}
