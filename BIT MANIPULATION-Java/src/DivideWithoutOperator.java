public class DivideWithoutOperator {
    public static void main(String[] args) {
        int x = 15, y = 3;
        int quotient = 0;
        while (x >= y) {
            int temp = y, multiple = 1;
            while (x >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            x -= temp;
            quotient += multiple;
        }
        System.out.println("Quotient: " + quotient);
    }
}
