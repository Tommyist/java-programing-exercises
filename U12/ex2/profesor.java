package ex2;

import java.util.Scanner;

public class profesor  {
	private String Nom;
	private String DNI;
	private int Edat;
	private String asignatura;

public profesor(String Nom,String DNI, int Edat,String asignatura){
	this.Nom=Nom;
	this.DNI=DNI;
	this.Edat=Edat;
	this.asignatura=asignatura;
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

public void setEdat(int edat) {
	Edat = edat;
}

public String getAsignatura() {
	return asignatura;
}

public void setAsignatura(String asignatura) {
	this.asignatura = asignatura;
}


}
