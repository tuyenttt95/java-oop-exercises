package lab_08;

public class Animal {
    private String name;
    private int speed;
    private int maxSpeed;
    private boolean flyable;

    public Animal() {
    }

    protected Animal(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        maxSpeed = builder.maxSpeed;
        flyable = builder.flyable;
    }

    // Read Only

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "Animal" +
            "name=" + name +
            ", speed=" + speed +
            ", maxSpeed=" + maxSpeed +
            ", flyable=" + flyable;
    }

    // Inner class
    public static class Builder {
        private String name;
        private int speed;
        private int maxSpeed;
        private boolean flyable;

        public Builder() {
        }
// Write Only

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

}
