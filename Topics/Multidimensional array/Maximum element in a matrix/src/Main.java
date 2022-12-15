class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = arr[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row + " " + col);
    }
}