package EXAMEN;

public class Movil extends Dispositivos{
    protected int GigasRam;

    public Movil(double Precio,String Nombre,int Gigas,int GigasRam) {
        super(Precio,Nombre,Gigas);
        this.GigasRam=GigasRam;
    }

    public int getGigasRam() {
        return GigasRam;
    }

    public void setGigasRam(int gigasRam) {
        GigasRam = gigasRam;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "GigasRam=" + this.getGigasRam() +
                ", Precio=" + this.getPrecio() +
                ", Nombre='" + this.getNombre() + '\'' +
                ", Gigas=" + this.getGigas() +
                '}';
    }
}
