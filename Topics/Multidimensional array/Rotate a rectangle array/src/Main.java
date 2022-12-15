import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depth = scanner.nextInt();
        int width = scanner.nextInt();

        int[][] matrixHorizon = new int[depth][width];

        for (int i = 0; i < matrixHorizon.length; i++) {
            for (int j = 0; j < matrixHorizon[0].length; j++) {
                matrixHorizon[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixVertical = new int[width][depth];

        for (int i = 0; i < matrixVertical.length; i++) {
            for (int j = 0; j < matrixVertical[i].length; j++) {
                matrixVertical[i][j] = matrixHorizon[matrixHorizon.length - j - 1][i];
            }
        }
        for (int[] row : matrixVertical) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}