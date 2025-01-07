package EXAMEN;

public class Tablet extends Dispositivos implements EnOferta{
    protected int Pantalla;

    public Tablet(double Precio,String Nombre,int Gigas,int Pantalla) {
        super(Precio,Nombre,Gigas);
        this.Pantalla=Pantalla;
    }

    public int getPantalla() {
        return Pantalla;
    }

    public void setPantalla(int almacenamiento) {
        Pantalla = Pantalla;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "Almacenamiento=" + this.getPantalla() +
                ", Precio=" + this.getPrecio() +
                ", Nombre='" + this.getNombre() + '\'' +
                ", Gigas=" + this.getGigas() +
                '}';
    }

    @Override
    public double AplicarDescuento() {
         return (getPrecio()*10)/100;
    }
}
