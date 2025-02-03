public class CountSetBits {
    public static void main(String[] args) {
        int n = 29; // Example input
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        System.out.println("Number of 1s: " + count);
    }
}
