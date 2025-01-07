package ex2;

public class alumne {

	private String Nom;
	private String DNI;
	private int Edat;
	private String Nivel;

public alumne(String Nom, String DNI, int Edat,String Nivel) {
	this.Nom=Nom;
	this.DNI=DNI;
	this.Edat=Edat;
	this.Nivel=Nivel;
	}

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public String getDNI() {
	return DNI;
}

public void setDNI(String dNI) {
	DNI = dNI;
}

public int getEdat() {
	return Edat;
}

public void setEdat(Short edat) {
	Edat = edat;
}

public String getNivel() {
	return Nivel;
}

public void setNivel(String nivel) {
	Nivel = nivel;
}

@Override
public String toString() {
	return "alumne [Nom=" + Nom + ", DNI=" + DNI + ", Edat=" + Edat + ", Nivel=" + Nivel + "]";
}





}
