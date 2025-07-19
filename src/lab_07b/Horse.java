package lab_07b;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static final int MAX_SPEED = 75; // Max speed in km/h

    public Horse(String name, int speed, int maxSpeed) {
        super(name, speed, maxSpeed);
    }

}
