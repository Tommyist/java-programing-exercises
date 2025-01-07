package EX6;

public class ex6_1 {

	public static void main(String[] args) {
		personas Joan= new personas();
		Joan.Nombre = "Joan Martinez";
		Joan.setDNI("41999999M");
		Joan.Edad=33;
		
		System.out.println("Nombre ......... :"+Joan.Nombre);
		System.out.println("DNI ......... :"+Joan.DNI);
		System.out.println("Edad ......... :"+Joan.Edad);	
	}
}
