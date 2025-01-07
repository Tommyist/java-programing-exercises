package EX9_1;

public class Profesor extends Persona{
    protected String asignatura;

    public Profesor(String Nom,String DNI, Short Edat,String asignatura){
        super(Nom,DNI,Edat);
        this.asignatura=asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public String toString() {
        return super.toString()+" Asignatura "+asignatura;
    }
}

