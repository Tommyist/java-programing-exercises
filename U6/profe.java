package EX6_1;

import java.util.Scanner;

public class profe extends persona6_5 {
	String asignatura;

public profe(String Nom,String DNI, Short Edat,String asignatura){
	super(Nom,DNI,Edat);
	this.asignatura=asignatura;
	}

public String getAsignatura() {
	return asignatura;
}

public void setAsignatura(String asignatura) {
	this.asignatura = asignatura;
}
public String MostrarDadesProfe() {
	return super.MostrarDades()+" Asignatura "+asignatura;
}
}
