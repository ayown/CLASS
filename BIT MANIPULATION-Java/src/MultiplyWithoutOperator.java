public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        int x = 5, y = 3;
        int result = 0;
        while (y != 0) {
            if ((y & 1) == 1) {
                result += x;
            }
            x <<= 1;
            y >>= 1;
        }
        System.out.println("Product: " + result);
    }
}
