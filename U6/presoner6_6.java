package EX6_1;

public class presoner6_6 extends persona6_6 {
	static String delicte;
	static String DataPrincipi;
	static String DataFinal;
	
	public presoner6_6(String nom,String cognoms, short edat,String delicte,String DataPrincipi, String DataFinal) {
		super(nom,cognoms,edat);
		this.delicte=delicte;
		this.DataFinal=DataPrincipi;
		this.DataPrincipi=DataPrincipi;
	}

	public static String getDelicte() {
		return delicte;
	}

	public static void setDelicte(String delicte) {
		presoner6_6.delicte = delicte;
	}

	public static String getDataPrincipi() {
		return DataPrincipi;
	}

	public static void setDataPrincipi(String dataPrincipi) {
		DataPrincipi = dataPrincipi;
	}

	public static String getDataFinal() {
		return DataFinal;
	}

	public static void setDataFinal(String dataFinal) {
		DataFinal = dataFinal;
	}
	
	public String MostrarDadesPresoner() {
		return " Nom :"+nom+ " Cognoms :" +cognoms+ " Edat :" +edat+ ". Esta comdemnat per :" +delicte+ "  i estara condemnat desde " +DataPrincipi+ " Fins al " +DataFinal; 
	}
}
