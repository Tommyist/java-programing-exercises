package EX9_2;

public class Alumne extends Persona {
        protected String Nivel;

        public Alumne(String Nom, String DNI, Short Edat,String Nivel) {
            super(Nom,DNI,Edat);
            this.Nivel=Nivel;
        }

        public String getNivel() {
            return Nivel;
        }

        public void setNivel(String nivel) {
            Nivel = nivel;
        }

        public String toString() {
            return super.toString()+" Nivell " +Nivel;
        }

    }

