public class ParityCheck {
    public static void main(String[] args) {
        int n = 29; // Example input
        int parity = 0;
        while (n != 0) {
            parity ^= n & 1;
            n >>= 1;
        }
        System.out.println("Parity: " + parity);
    }
}
