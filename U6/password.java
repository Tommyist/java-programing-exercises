package EX6;

import java.util.Random;

public class password {
	static String password = new String();
	int longitud;
	
	public password(){
		this.generarPassword(8);
			}
public password(int mida){
	this.generarPassword(mida);
		}

public static String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getLongitud() {
	return longitud;
}
public void setLongitud(int longitud) {
	this.longitud = longitud;
}
public static  void generarPassword (int mida) {
	Random rnd = new Random();
	password= "";
	for (int i=0;i<mida;i++) {
		char c=(char)rnd.nextInt( '!', '~');
		password+=c;
	}
}
public static  void esRobust(int mida){
	boolean minus = false,majus = false,esp = false,num = false;
	int longitud=mida;
	for (int i=0;i<longitud;i++) {
	if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') { // i='a';i<'z';i++
		minus=true;
	}
	else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
		majus=true;
		}
	else if (password.charAt(i) >='1' && password.charAt(i) <= '9') {
		num=true;
		}
	else if (password.charAt(i)>='!' && password.charAt(i)<='~') {
		esp=true;
		}
	
	}
	if ( (minus==true )&& (majus==true) && (num==true) && (esp==true)) {
		System.out.println(" La contraseña es correcte");
	}
	else {
		System.out.println(" No es robust");
	}
} 
}
