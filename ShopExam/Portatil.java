package EXAMEN;

public class Portatil extends Dispositivos{
    protected int HerziosPantalla;

    public Portatil(double Precio,String Nombre,int Gigas, int HerziosPantalla ) {
        super(Precio,Nombre,Gigas);
        this.HerziosPantalla=HerziosPantalla;
    }

    public int getHerziosPantalla() {
        return HerziosPantalla;
    }

    public void setHerziosPantalla(int herziosPantalla) {
        HerziosPantalla = herziosPantalla;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "HerziosPantalla=" + this.getHerziosPantalla() +
                ", Precio=" + this.getPrecio() +
                ", Nombre='" + this.getNombre() + '\'' +
                ", Gigas=" + this.getGigas() +
                '}';
    }
}
