import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[scanner.nextInt()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        int referenceNum = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > referenceNum) {
                sum += intArray[i];
            }
        }

        System.out.println(sum);
    }
}