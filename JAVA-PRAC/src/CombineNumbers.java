import java.util.Scanner;

public class CombineNumbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        String firstTwo = String.valueOf(num1).substring(0, 2);
        String lastTwo = String.valueOf(num2).substring(Math.max(0, String.valueOf(num2).length() - 2));

        String result = firstTwo + lastTwo;
        System.out.println("Combined number: " + result);
    }
}
