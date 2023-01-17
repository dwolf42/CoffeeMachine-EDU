class TimeConstantsDemo {

    public static void main(String[] args) {
        System.out.println(TimeConstants.SECONDS_IN_DAY);
        System.out.println(TimeConstants.SECONDS_IN_WEEK);
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    public static final int SECONDS_IN_DAY = 24 * SECONDS_IN_HOUR;
    public static final int SECONDS_IN_WEEK = 7 * SECONDS_IN_DAY;

    // Quote from Sorabh Tomar:
    // Does nothing. Just a regular constructor. It's given a private access modifier to not allow the creation of
    // instance of TimeConstants class outside of it. Because as you can see, we don't need that here.
    // We're just accessing it's static fields.
    private TimeConstants() {
    }
}