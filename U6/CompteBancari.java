package EX6;

public class CompteBancari {
		private String dniTitular = new String ();
		private String nomTitular =new String ();
		private double saldo =0;
		
		//No torna res
		public CompteBancari ()  {
			
		}
		public CompteBancari (String dniTitular, String nomTitular, double saldo)  {
			this.dniTitular= dniTitular;
			this.nomTitular=nomTitular;
			this.saldo=saldo;
		}
		public void ingresar(double quantitat) {
			//Añadir al saldo
			saldo+=quantitat;
		}
		public void reintegrar(double quantitat)  {
			//Quitar al saldo
			saldo-=quantitat;
		}
		public  void MostrarSaldo() {
			//Mostrar saldo
			System.out.println("Saldo disponible : " +saldo );
		}
		
		public String getDniTitular() {
			return dniTitular;
		}
		public void setDniTitular(String dniTitular) {
			this.dniTitular = dniTitular;
		}
		public String getNomTitular() {
			return nomTitular;
		}
		public void setNomTitular(String nomTitular) {
			this.nomTitular = nomTitular;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public void IngressarDinero (int cantidadAIngresar) {
			saldo+=cantidadAIngresar;
		}		
}
