import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine()) {
            case "triangle":
                calcTriangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
            case "rectangle":
                calcRectangle(scanner.nextInt(), scanner.nextInt());
                break;
            case "circle":
                calcCircle(scanner.nextInt());
                break;
            default:
                System.out.println("Error, invalid input");
                break;

        }
    }

    public static void calcTriangle(float a, float b, float c) {
        float perimeter = a + b + c;
        float multiplier = 0.25F;

        System.out.println(multiplier *
                Math.sqrt(perimeter *
                        (perimeter - 2 * a) *
                        (perimeter - 2 * b) *
                        (perimeter - 2 * c)));
    }

    public static void calcRectangle(float a, float b) {
        System.out.println(a * b);

    }

    public static void calcCircle(float r) {
        double pi = 3.14;
        System.out.println(r * r * pi);

    }

}
