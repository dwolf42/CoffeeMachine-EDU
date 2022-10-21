public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.hours = 12;
        clock.minutes = 58;

        int runs = 0;
        while (runs <= 5) {
            clock.next();
            System.out.printf("Hours: %d Minutes: %d%n", clock.hours, clock.minutes);
            runs++;
        }
    }
}


class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (this.hours == 12 && this.minutes == 59) {
            this.hours = 1;
            this.minutes = 0;
        } else if (this.minutes != 60) {
            this.minutes++;
        } else if (this.hours != 12 && this.minutes != 60) {
            this.hours++;
            this.minutes = 0;
        }
    }
}