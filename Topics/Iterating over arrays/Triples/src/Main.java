import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] input = new int[arrLength];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        ArrayTriples.setArray(input);
        TripleChecker.checkArray(ArrayTriples.getArray());
        Prints.theNum(TripleChecker.getTriples());
    }
}

class ArrayTriples {
    private static int[] input;

    public static void setArray(int[] input) {
        int arrLength = input.length;
        ArrayTriples.input = new int[arrLength];
        System.arraycopy(input, 0, ArrayTriples.input, 0, input.length);
    }

    public static int[] getArray() {
        int[] copy = new int[ArrayTriples.input.length];
        System.arraycopy(ArrayTriples.input, 0, copy, 0, copy.length);
        return copy;
    }
}

class TripleChecker {
    private static int triples = 0;

    public static void checkArray(int[] copy) {
        for (int i = 0; i < copy.length - 2; i++) {
            if (copy[i + 1] - copy[i] == 1 && copy[i + 2] - copy[i + 1] == 1) {
                triples++;
            }
        }
    }

    public static int getTriples() {
        return TripleChecker.triples;
    }
}

class Prints {
    public static void theNum(int triple) {
        System.out.println(triple);
    }
}
