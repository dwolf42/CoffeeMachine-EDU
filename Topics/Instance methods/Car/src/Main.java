
class Car {

    int yearModel;
    String make;
    int speed;
    private static final int CHANGE_SPEED = 5;

    public void accelerate() {
        this.speed += this.CHANGE_SPEED;
    }

    public void brake() {
        this.speed -= this.CHANGE_SPEED;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}