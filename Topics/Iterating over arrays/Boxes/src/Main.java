import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(box1);
        Arrays.sort(box2);
        int a = 0;
        int b = 0;

        for (int i = 0; i < box1.length; i++) {
            if (box1[i] < box2[i]) {
                b++;
            } else if (box1[i] > box2[i]){
                a++;
            }
        }

        System.out.println(a == 3 ? "Box 1 > Box 2" : b == 3 ? "Box 1 < Box 2" : "Incompatible");
    }
}