package EX9_5;

public class Persona {

        public String Nom;
        public String Cognoms;
        public int edad;

        public Persona(String Nom,String Cognoms,int edad) {
            this.Nom=Nom;
            this.Cognoms=Cognoms;
            this.edad=edad;
        }

        public String getNom() {
            return this.Nom;
        }

        public void setNom(String nom) {
            this.Nom = nom;
        }

        public String getCognoms() {
            return this.Cognoms;
        }

        public void setCognoms(String cognoms) {
            this.Cognoms = cognoms;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String toString() {
            return "Nom :" +this.getNom()+ " Cognoms " +this.getCognoms()+ " Edat " +this.getEdad();
        }
    }




