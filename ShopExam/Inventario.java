package EXAMEN;

import java.util.Scanner;

public class Inventario {

    //Declarem l'arrray amb el contador, l'escaner i l'array de Dispositivos
    public static Dispositivos[]ArrayDispositivos = new Dispositivos[100];

    public static int DispositivosCreados;

    public static Scanner lector = new Scanner(System.in);

    public static void main (String[]args) {
    int op;
        do{
            System.out.println("1/ Introducir nuevo dispositivo");
            System.out.println("2/ Mostrar todos los portatiles");
            System.out.println("3/ Mostrar todas las tablets");
            System.out.println("4/ Mostrar todos los moviles");
            System.out.println("5/ Mostrar todos los dispositivos");
            System.out.println("6/ Mostrar cuantos dispositivos hay de cada tipo y el numero total de dispositivos");
            System.out.println("7/ Mostrar precio sumado de todos los portatiles");
            System.out.println("8/ Mostrar precio sumado de todas las tablets SIN descuento");
            System.out.println("9/ Mostrar precio sumado de todas las tablets CON descuento");
            System.out.println("10/ Mostrar precio sumado de todos los moviles ");
            System.out.println("11/ Mostrar precio sumado de todos los dispositivos ");
            op=lector.nextInt();

            if(op==1){
                NuevoDispositivo();
            }
            if(op==2){
                MostrarTodosPortatlies();
            }
            if(op==3){
                MostrarTodasTablets();
            }
            if(op==4){
                MostrarTodosTelefonos();
            }
            if(op==5){
                MostrarTodosDispositivos();
            }
            if(op==6){
                CantidadDispositivosYQualesSon();
            }
            if(op==7){
                PrecioSumadoPortatil();
            }
            if(op==8){
                PrecioSumadoTabletsSINDescuento();
            }
            if(op==9){
                PrecioSumadoTabletsCONDescuento();
            }
            if(op==10){
                PrecioSumadoMoviles();
            }
            if(op==11){
                MostrarTodoElPrecio();
            }

            if(op==0||op>=13) {
                System.out.println("ERROR");
            }

        }
     while(op!=12);
        System.out.println("Has cerrado el programa");

    }

    //Declarem les funcionss
    public static void NuevoDispositivo() {
        System.out.println("Que Dispositivo quieres crear");
        System.out.println("1/ Portatil");
        System.out.println("2/ Tablet");
        System.out.println("3/ Movil");
        int Crear=lector.nextInt();
        switch(Crear) {
            case 1:
               CrearPortatil();
                break;
            case 2:
                CrearTablet();
                break;
            case 3:
                CrearTelefono();
                break;

        }
    }
    public static void CrearPortatil() {
        System.out.println("Precio");
        double Precio = lector.nextDouble();
        System.out.println("Nombre");
        String Nombre=lector.next();
        System.out.println("Gigas de almacenamiento");
        int Gigas = lector.nextInt();
        System.out.println("Herzios de la pantalla");
        int HerziosPantalla= lector.nextInt();

        ArrayDispositivos[DispositivosCreados] = new Portatil(Precio,Nombre,Gigas,HerziosPantalla);
        DispositivosCreados++;
    }

    public static void CrearTablet() {
        System.out.println("Precio");
        double Precio = lector.nextDouble();
        System.out.println("Nombre");
        String Nombre=lector.next();
        System.out.println("Gigas de almacenamiento");
        int Gigas = lector.nextInt();
        System.out.println("Tamaño de la pantalla");
        int Pantalla = lector.nextInt();

        ArrayDispositivos[DispositivosCreados] = new Tablet(Precio,Nombre,Gigas,Pantalla);
        DispositivosCreados++;

    }
    public static void CrearTelefono() {
        System.out.println("Precio");
        double Precio = lector.nextDouble();
        System.out.println("Nombre");
        String Nombre=lector.next();
        System.out.println("Gigas de almacenamiento");
        int Gigas = lector.nextInt();
        System.out.println("Gigas de RAM");
        int GigasRAM = lector.nextInt();

        ArrayDispositivos[DispositivosCreados] = new Movil(Precio,Nombre,Gigas,GigasRAM);
        DispositivosCreados++;
    }
    public static void MostrarTodosPortatlies() {
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Portatil) {
                System.out.println(ArrayDispositivos[i].toString());
                System.out.println();
            }
        }
    }
    public static void MostrarTodasTablets() {
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Tablet) {
                System.out.println(ArrayDispositivos[i].toString());
                System.out.println();
            }
        }
    }
    public static void MostrarTodosTelefonos() {
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Movil) {
                System.out.println(ArrayDispositivos[i].toString());
                System.out.println();
            }
        }
    }

    public static void MostrarTodosDispositivos() {
        System.out.println("Portatiles");
        System.out.println();
        for(int i=0;i<DispositivosCreados;i++) {
            {
                if(ArrayDispositivos[i] instanceof Portatil) {
                    System.out.println(ArrayDispositivos[i].toString());
                    System.out.println();
                }
            }
        }
        System.out.println("Tablets");
        System.out.println();
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Tablet) {
                System.out.println(ArrayDispositivos[i].toString());
                System.out.println();
            }
        }
        System.out.println("Moviles");
        System.out.println();
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Movil) {
                System.out.println(ArrayDispositivos[i].toString());
                System.out.println();
            }
        }
    }
    public static void CantidadDispositivosYQualesSon() {
        int portatilesCreados = 0;
        int tabletsCreados = 0;
        int movilesCreados = 0;
        for (int i = 0; i < DispositivosCreados; i++) {
            if (ArrayDispositivos[i] instanceof Portatil) {
                portatilesCreados++;
            }
        }
        System.out.println("Hay estos portatiles " + portatilesCreados);
        System.out.println();
        for (int i = 0; i < DispositivosCreados; i++) {
            if (ArrayDispositivos[i] instanceof Tablet) {
                tabletsCreados++;
            }
        }
        System.out.println("Hay estas tablets "  + tabletsCreados);
        System.out.println();

        for (int i = 0; i < DispositivosCreados; i++) {
            if (ArrayDispositivos[i] instanceof Movil) {
                movilesCreados++;
            }
        }
        System.out.println("Hay estas tablets " + movilesCreados);
        System.out.println();
    }
    public static void PrecioSumadoPortatil() {
        double PrecioPortatilTotal=0;
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Portatil) {
                PrecioPortatilTotal = PrecioPortatilTotal+ArrayDispositivos[i].getPrecio();
            }
        }
        System.out.println("El precio total de los portatiles seria " +PrecioPortatilTotal);
        System.out.println();
    }
    public static void PrecioSumadoTabletsSINDescuento() {
        double PrecioTotalTablets=0;
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Tablet) {
                PrecioTotalTablets = PrecioTotalTablets+ArrayDispositivos[i].getPrecio();
            }
        }
        System.out.println("El precio total de las tablets SIN descuento seria " +PrecioTotalTablets);
        System.out.println();
    }
    public static void PrecioSumadoTabletsCONDescuento() {
        double PrecioTotalTabletsConImpuesto=0;
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Tablet) {
                ArrayDispositivos[i].getPrecio();
                PrecioTotalTabletsConImpuesto=PrecioTotalTabletsConImpuesto + ((Tablet) ArrayDispositivos[i]).AplicarDescuento();

            }
        }
        System.out.println("El precio total de las tablets SIN descuento seria " +PrecioTotalTabletsConImpuesto);
        System.out.println();
    }
    public static void PrecioSumadoMoviles() {
        double PrecioTotalMoviles=0;
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Movil) {
                PrecioTotalMoviles = PrecioTotalMoviles +ArrayDispositivos[i].getPrecio();
            }
        }
        System.out.println("El precio total de las tablets SIN descuento seria " +PrecioTotalMoviles);
        System.out.println();
    }
    public static void MostrarTodoElPrecio() {
        double PrecioTotal=0;
        double PrecioTotalMoviles=0;
        double PrecioTotalTablets=0;
        double PrecioPortatilTotal=0;

        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Portatil) {
                PrecioPortatilTotal = PrecioPortatilTotal+ArrayDispositivos[i].getPrecio();
            }
        }
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Tablet) {
                PrecioTotalTablets = PrecioTotalTablets+ArrayDispositivos[i].getPrecio();
            }
        }
        for(int i=0;i<DispositivosCreados;i++) {
            if(ArrayDispositivos[i] instanceof Movil) {
                PrecioTotalMoviles = PrecioTotalMoviles +ArrayDispositivos[i].getPrecio();
            }
        }
        PrecioTotal= PrecioTotalMoviles + PrecioTotalTablets + PrecioPortatilTotal;
        System.out.println("EL PRECIO DE TODOS LOS ELEMENTOS SERIA " +PrecioTotal);
        System.out.println();
    }
}
