
class Car {

    int yearModel;
    String make;
    int speed;
    int changeSpeed = 5;

    public void accelerate() {
        this.speed += this.changeSpeed;
    }

    public void brake() {
        this.speed -= this.changeSpeed;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}