package EX7_7;

public class BuitReinas {

    static int[] tablero = new int[8];
    static int intents =0;

    public static void main(String[] args) {
        check(0);
    }
    public static void check (int n) {
        int reinas = 8;

        if (n==reinas) {
            intents++;
            System.out.println("Solucio " +intents +"\n");
            Mostrar();
            return;
        }
        for(int i =0;i<reinas;i++) {
            tablero[n] =i;

            if(judge(n)) {
                check(n+1);
            }
        }
    }
    public static boolean judge(int n) {
        for(int i=0;i<n;i++) {
            if(tablero[n] == tablero[i] || Math.abs(tablero[n] - tablero[i]) == Math.abs(n-i)) {
                return false;
            }
        }
        return true;
    }
    public static void Mostrar() {
        for(int i=0;i<tablero.length;i++) {
            for(int j=0; j <tablero.length;j++) {
                if(tablero[j]==i) {
                    System.out.print("|_R_");
                }
                else {
                    System.out.print("|___");
                }
            }
            System.out.println("|");
        }
    }

}
