import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequenceLength = 0;
        while(scanner.nextInt() != 0) {
            sequenceLength++;
        }
        System.out.println(sequenceLength);
    }
}