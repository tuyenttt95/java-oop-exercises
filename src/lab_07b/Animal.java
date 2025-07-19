package lab_07b;

public class Animal {
    private String name;
    private int speed;
    private int maxSpeed;

    public Animal(String name, int speed, int maxSpeed) {
        this.name = name;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String toString() {
        return String.format("Animal is %s, Speed: %d km/h, MaxSpeed: %d km/h", getName(), getSpeed(), getMaxSpeed());
    }
}
