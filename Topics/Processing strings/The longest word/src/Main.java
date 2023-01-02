import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        for (String str : split) {
            if (str.length() > StringLongest.getLongest().length()) {
                StringLongest.setLongest(str);
            }
        }

        System.out.printf("%s",
                StringLongest.getLongest());
    }
}

class StringLongest {
    static String longest = "";

    public static String getLongest() {
        return longest;
    }

    public static void setLongest(String longest) {
        StringLongest.longest = longest;
    }
}