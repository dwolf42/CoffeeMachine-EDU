
class Clock {
    private static final int MAX_HOURS = 12;
    private static final int MAX_MINUTES = 59;
    private static final int MIN_MINUTES = 0;
    private static final int MIN_HOURS = 1;

    int hours = MAX_HOURS;
    int minutes = MIN_MINUTES;

    void next() {

        if (this.hours == MAX_HOURS && this.minutes == MAX_MINUTES) {
            this.hours = MIN_HOURS;
            this.minutes = MIN_MINUTES;
        } else if (this.minutes == MAX_MINUTES) {
            this.minutes = MIN_MINUTES;
            this.hours++;
        } else if (this.minutes < MAX_MINUTES) {
            this.minutes++;
        } else {
            System.out.println("Error");
        }
    }
}

