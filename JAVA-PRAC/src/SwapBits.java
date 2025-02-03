public class SwapBits {
    public static void main(String[] args) {
        int n = 29; // Example input
        int i = 1, j = 3; // Positions to swap
        if (((n >> i) & 1) != ((n >> j) & 1)) {
            n ^= (1 << i) | (1 << j);
        }
        System.out.println("Number after swapping: " + n);
    }
}
