public class PalindromeCheck {
    public static void main(String[] args) {
        int n = 121, original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("Is palindrome: " + (original == reversed));
    }
}
