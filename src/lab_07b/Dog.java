package lab_07b;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static final int MAX_SPEED = 60; // Max speed in km/h

    public Dog(String name, int speed, int maxSpeed) {
        super(name, speed, maxSpeed);
    }

}
