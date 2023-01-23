public class Main {
    public static void main(String[] args) {
        int counter = 0;

        for (Secret secr : Secret.values()) {
            if (secr.name().contains("STAR")) {
                counter++;
            }
        }


        System.out.println(counter);
    }
}

/* sample enum for inspiration */
