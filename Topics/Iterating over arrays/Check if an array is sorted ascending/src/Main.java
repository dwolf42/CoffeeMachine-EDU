import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[] array = new int[defineLength];
        boolean isAscending = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 1; j < array.length; j++) {
            if (array[j] < array[j - 1]) {
                isAscending = true;
                break;
            }
        }
        System.out.println(isAscending ? "false" : "true");
    }
}

/*
wir gehen davon aus, es ist nicht aufsteigend (false)
wenn array[i] größer ist als als array[i - 1], dann aufsteigend (true)

4 > 5 true
5 > 2 false
2 > 7 true

4
4 5 2 7
1 2 3 0
false
0
true
1
true
1
true
2
-----------
4
1 2 3 4
false
0
true
1
true
2
true
3
 */