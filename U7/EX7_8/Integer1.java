package EX7_8;

public class Integer1 {
    private int value;

            public Integer1(int value) {
                this.value=value;
            }

            public int intValue() {
                return value;
            }

            public long longValue() {
                return(long)value;
            }
    public float floatValue() {
        return (float) value;
    }

    public double doubleValue() {
        return (double) value;
    }

    public static int parseInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public static int parseInt(String s, int radix) throws NumberFormatException {
        return Integer.parseInt(s, radix);
    }

    public static Integer1 valueOf(int i) {
        return new Integer1(i);
    }

    public static Integer1 valueOf(String s) throws NumberFormatException {
        return new Integer1(Integer.parseInt(s));
    }

    public String toString() {
        return Integer.toString(value);
    }

    public int hashCode() {
        return Integer.hashCode(value);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Integer1) {
            Integer1 other = (Integer1) obj;
            return this.value == other.value;
        }
        return false;
    }

    public int compareTo(Integer1 anotherInteger) {
        return Integer.compare(this.value, anotherInteger.value);
    }

    public static int compare(int x, int y) {
        return Integer.compare(x, y);
    }

    public static int max(int a, int b) {
        return Integer.max(a, b);
    }

    public static int min(int a, int b) {
        return Integer.min(a, b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int divideUnsigned(int dividend, int divisor) {
        return Integer.divideUnsigned(dividend, divisor);
    }

    public static int remainderUnsigned(int dividend, int divisor) {
        return Integer.remainderUnsigned(dividend, divisor);
    }

    public static int highestOneBit(int i) {
        return Integer.highestOneBit(i);
    }

    public static int lowestOneBit(int i) {
        return Integer.lowestOneBit(i);
    }

    public static int numberOfLeadingZeros(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    public static int numberOfTrailingZeros(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    public static int reverse(int i) {
        return Integer.reverse(i);
    }

    public static int reverseBytes(int i) {
        return Integer.reverseBytes(i);
    }

    public static int rotateLeft(int i, int distance) {
        return Integer.rotateLeft(i, distance);
    }

    public static int rotateRight(int i, int distance) {
        return Integer.rotateRight(i, distance);
    }

    public static int signum(int i) {
        return Integer.signum(i);
    }

    public static int toUnsignedInt(byte value) {
        return Byte.toUnsignedInt(value);
    }

    public static int toUnsignedInt(short value) {
        return Short.toUnsignedInt(value);
    }

    public static long toUnsignedLong(int value) {
        return Integer.toUnsignedLong(value);
    }


}
