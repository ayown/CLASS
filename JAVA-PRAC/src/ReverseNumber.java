public class ReverseNumber {
    public static void main(String[] args) {
        int n = -245;
        int reversed = 0;
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("Reversed: " + reversed * sign);
    }
}
