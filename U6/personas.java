package EX6;

public class personas {
	String DNI;
	String Nombre;
	Short Edad;
	
	public void Persona(String DNI, Short Edad, String Nombre) {
		this.DNI = DNI;
		this.Nombre=Nombre;
		this.Edad=Edad;
	}
	public void setNombre(String nombre) {
		this.Nombre=Nombre;
	}
	public void setDNI(String DNI) {
		this.DNI=DNI;
	} 
	public void setEdad() {
		this.Edad=Edad;
	}

}
