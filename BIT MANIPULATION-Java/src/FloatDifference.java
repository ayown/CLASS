public class FloatDifference {
    public static void main(String[] args) {
        float a = 1.2345f, b = 1.2344f, epsilon = 0.001f;
        System.out.println("Difference < epsilon: " + (Math.abs(a - b) < epsilon));
    }
}
