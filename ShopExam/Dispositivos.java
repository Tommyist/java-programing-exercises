package EXAMEN;

public class Dispositivos {
    protected double Precio;
    protected String Nombre;
    protected int Gigas;

    public Dispositivos(double Precio, String Nombre, int Gigas) {
        this.Precio=Precio;
        this.Nombre=Nombre;
        this.Gigas=Gigas;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getGigas() {
        return Gigas;
    }

    public void setGigas(int gigas) {
        Gigas = gigas;
    }

    @Override
    public String toString() {
        return "Dispositivos{" +
                "Precio=" + this.getPrecio() +
                ", Nombre='" + this.getNombre() + '\'' +
                ", Gigas=" + this.getGigas() +
                '}';
    }

}
