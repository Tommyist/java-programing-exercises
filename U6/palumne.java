package EX6_1;

public class palumne extends persona6_5 {
static String Nivel;

public palumne(String Nom, String DNI, Short Edat,String Nivel) {
	super(Nom,DNI,Edat);
	this.Nivel=Nivel;
	}

public String getNivel() {
	return Nivel;
}

public void setNivel(String nivel) {
	Nivel = nivel;
}

public String MostrarDadesAlumne() {
return super.MostrarDades()+" Nivell " +Nivel;
}

}
