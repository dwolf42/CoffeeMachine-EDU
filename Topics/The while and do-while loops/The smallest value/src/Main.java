import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1L;
        long o = 1L;
        do {
            o++;
            n *= o;
        } while (n <= m);
        System.out.println(o);
    }
}