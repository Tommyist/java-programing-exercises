package EX9_6;

public class Tirada {
    String NomUsuari;
    int Punts;
    public Tirada(String NomUsuari,int Punts) {
        this.Punts = Punts;
        this.NomUsuari = NomUsuari;
    }

    public String getNomUsuari() {
        return NomUsuari;
    }

    public void setNomUsuari(String nomUsuari) {
        NomUsuari = nomUsuari;
    }

    public int getPunts() {
        return Punts;
    }

    public void setPunts(int punts) {
        Punts = punts;
    }

    @Override
    public String toString() {
        return
                "NomUsuari='" + this.getNomUsuari() + '\'' +
                ", Punts=" + this.getPunts() +
                '}';
    }
}
