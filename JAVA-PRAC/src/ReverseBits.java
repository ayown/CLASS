public class ReverseBits {
    public static void main(String[] args) {
        long n = 0b101010; // Example input
        long result = 0;
        for (int i = 0; i < 64; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        System.out.println("Reversed: " + result);
    }
}
