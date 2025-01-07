package EX6_1;

public class policia6_6 extends persona6_6{
	static String Nivell;
	static int Experiencia;
	
	public policia6_6(String nom,String cognoms, short edat,String Nivell, int Experiencia) {
		super(nom,cognoms,edat);
		this.Nivell=Nivell;
		this.Experiencia=Experiencia;
	}

	public static String getNivell() {
		return Nivell;
	}

	public static void setNivell(String nivell) {
		Nivell = nivell;
	}

	public static int getExperiencia() {
		return Experiencia;
	}

	public static void setExperiencia(int experiencia) {
		Experiencia = experiencia;
	}
	public String MostrarDadesPolicia() {
		return " Nom :"+nom+ " Cognoms :" +cognoms+ " Edat :" +edat+ ". Te la categoria de  " +Nivell+ " i te " +Experiencia+ " anys d'experiencia";
	} 
}
