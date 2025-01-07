package EX6;

import java.util.Scanner;

public class data {

	int dia;
	int mes;
	int any;
	
	public data() {
		
	}
	
	public data(int dia,int mes,int any) {
		this.dia=dia;
		this.mes=mes;
		this.any=any;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}
    private boolean Bisiesto() {
        return (any % 4 == 0 && any % 100 != 0 || any % 400 == 0);
    }
        
	public boolean DataCorrecte() {
		boolean diaC,mesC,anyC;
		anyC= any >0;
		mesC= mes>=1 && mes<=12;
		switch (mes) {
		 default:
             diaC = dia >= 1 && dia <= 31;
			case 1:
				if(Bisiesto()) {
                    diaC = dia >= 1 && dia <= 29;
				}else {
					diaC = dia >= 1 && dia <= 28;	
				}
				break;
			case 2:
        diaC = dia >= 1 && dia <= 30;
        break;
		}
		return diaC && mesC && anyC;
		}
	
		public String Dema() {
		dia++;
		if (!DataCorrecte() ) {
			dia=1;
			mes++;
		}
		if (!DataCorrecte()) {
			mes=1;
			any++;
		}
		return (dia +" - " + mes +" - "+ any ); 
	}
		public static void CrearData() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix una data");
		System.out.println("Dia");
		int dia = lector.nextInt();
		System.out.println("Mes");
		int mes = lector.nextInt();
		System.out.println("Any");
		int any = lector.nextInt();
		data Cdata= new data(dia,mes,any);
		String dataC = (dia +" - " + mes +" - "+ any );
		System.out.print(dataC);
		if (Cdata.DataCorrecte()) {
			System.out.println("Dema sera...");
			for(int i=0;i<1;i++) {
				Cdata.Dema();
				System.out.print(Cdata.Dema());
			}
		}
		else {
			System.out.println("Posa una altre data");
		}
		
	}
}