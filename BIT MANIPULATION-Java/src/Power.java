public class Power {
    public static void main(String[] args) {
        int x = 2, y = 3;
        int result = 1;
        while (y != 0) {
            if ((y & 1) == 1) {
                result *= x;
            }
            x *= x;
            y >>= 1;
        }
        System.out.println("Result: " + result);
    }
}
