package EX8_4;

public class LaMevaExcepcio extends Exception {
    private Integer valor;
    public LaMevaExcepcio (int xxx) {
    valor = new Integer(xxx);
    }
    public String toString () {
    return "Exception LaMevaExcepcio: Error motivat per valor" + valor.toString();
    }
}
