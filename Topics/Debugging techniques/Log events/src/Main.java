
class Util {
    public static String capitalize(String str) {

        System.out.printf("Before: %s%n",
                str);

        if (str == null || str.isBlank()) {
            System.out.printf("After: %s%n",
                    str);
            return str;
        }

        if (str.length() == 1) {
            System.out.printf("After: %s%n",
                    str.toUpperCase());
            return str;
        }

        System.out.printf("After: %s%n",
                Character.toUpperCase(str.charAt(0)) + str.substring(1));
        return str;
    }
}