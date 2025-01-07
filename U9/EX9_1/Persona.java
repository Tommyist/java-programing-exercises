package EX9_1;

public class Persona {
    String Nom;
    String DNI;
    short Edat;

    public  Persona(String Nom,String DNI, Short Edat) {
        this.Nom = Nom;
        this.DNI = DNI;
        this.Edat = Edat;
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

    public short getEdat() {
        return Edat;
    }
    public void setEdat(short edad) {
        Edat = edad;
    }
    public String toString() {
        return " Nom " +this.Nom+ " DNI " +this.DNI+ " Edat " +this.Edat;
    }

}

