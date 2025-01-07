package EX7_8;

public class Programa {

    public static void main(String[] args) {

        Integer1 intproba = new Integer1(25);
        System.out.println("Valor de l'Integer1 = " +intproba);
        Integer1 intcanvi = new Integer1(33); //Crear un integer per poder fer probes
        System.out.println("Valor de l'alte Integer " +intcanvi);

        // Doublevalue
        System.out.println(intproba.doubleValue());
        // floatValue
        System.out.println(intproba.floatValue());
        //parseInt
        System.out.println(intproba.parseInt("F",23));
        //valueOf
        System.out.println(intproba.valueOf(34));
        //equals
        System.out.println(intproba.equals(intcanvi));
        //compareTo
        System.out.println(intproba.compareTo(intcanvi));
        //min
        System.out.println(intproba.min(11,22));
        //max
        System.out.println(intproba.max(221,322));
        //sum
        System.out.println(intproba.sum(25,33));
        //divideUnsigned
        System.out.println(intproba.divideUnsigned(22,2));
        //remainderUnsigned
        System.out.println(intproba.remainderUnsigned(125,3));
        //highestOneBit
        System.out.println(intproba.highestOneBit(2));
        //lowestOneBit
        System.out.println(intproba.lowestOneBit(0));
        //numberOfLeadingZeros
        System.out.println(intproba.numberOfLeadingZeros(25));
        //numberofTrailingZeros
        System.out.println(intproba.numberOfTrailingZeros(24));
        //reverse
        System.out.println(intproba.reverse(23));
        //reverseBytes
        System.out.println(intproba.reverseBytes(33));
        //rotateRight
        System.out.println(intproba.rotateRight(3,23));
        //signum
        System.out.println(intproba.signum(0));


    }

}
