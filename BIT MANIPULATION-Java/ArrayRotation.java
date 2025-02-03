public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13};

        System.out.println("Original array:");
        printIntArray(array);
        printBinaryArray(array);

        rotateRightBy2Bits(array);

        System.out.println("After rotation array:");
        printIntArray(array);
        printBinaryArray(array);
    }

    public static void rotateRightBy2Bits(int[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = (s[i] >>> 2);
            if (s[i]==(s.length-1)){
               s[i] = (s[i]<< (32 - 2));
            }
        }
    }

    public static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printBinaryArray(int[] array) {
        for (int i : array) {
            System.out.print("00000000000000000000000000000000".substring(Integer.toBinaryString(i).length()) +
                    Integer.toBinaryString(i) + " ");
        }
        System.out.println();
        }
}