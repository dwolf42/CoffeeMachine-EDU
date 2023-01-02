class Main {
    public static void main(String[] args) {
        Sequencer.startSequence();
    }
}

class Sequencer {
    private static int maxDivisible;

    public static void startSequence() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        String[] whyTheHeckCantThisInputJustBeINT = scanner.nextLine().split(" ");
        int elements = scanner.nextInt();
        int[] whyTheHeckCantThisInputJustBeINT = new int[elements];

        for (int i = 0; i < whyTheHeckCantThisInputJustBeINT.length; i++) {
            whyTheHeckCantThisInputJustBeINT[i] = scanner.nextInt();
        }

        for (int i = 0; i < whyTheHeckCantThisInputJustBeINT.length; i++) {
            if (whyTheHeckCantThisInputJustBeINT[i] % 4 == 0 &&
                    whyTheHeckCantThisInputJustBeINT[i] > maxDivisible) {
                maxDivisible = whyTheHeckCantThisInputJustBeINT[i];
            }
        }
        System.out.println(maxDivisible);
    }
}