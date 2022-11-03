import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arrayLength = scanner.nextInt();
        int[] inputArray = new int[arrayLength];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int temp = inputArray[inputArray.length - 1];
        int[] outputArray = new int[inputArray.length];
        for (int i = 1; i < outputArray.length; i++) {
            outputArray[i] = inputArray[i - 1];
        }
        outputArray[0] = temp;

        for (int indexes : outputArray) {
            System.out.print(indexes + " ");
        }
    }
}