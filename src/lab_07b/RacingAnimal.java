package lab_07b;

import java.security.SecureRandom;

/**
 ## LAB 7.2 Racing animal simple version
 * Horse: Max 75 km/h
 * Tiger: Max 100 km/h
 * Dog: Max 60 km/h
 * ---
 * * Create an Animal class with a method speed() which return a **random** speeds
 * * Create 3 objects for those 3 animal type
 * * Run and see which animal is winner for racing
 * * Bonus: Default name with Class variable
 * * Format: `Winner is <Animal name>, with speed: <speed>`
 * * Hints:* * Class name can get from: `object.getClass().getSimpleName();`
 * * ```int randomSpeed = new SecureRandom().nextInt(50);```
 */

public class RacingAnimal {
    public static void main(String[] args) {
        Animal horse = new Horse("Horse", new SecureRandom().nextInt(75), 75);
        Animal tiger = new Tiger("Tiger", new SecureRandom().nextInt(100), 100);
        Animal dog = new Dog("Dog", new SecureRandom().nextInt(60), 60);

        System.out.println(horse.toString());
        System.out.println(tiger.toString());
        System.out.println(dog.toString());

        while (true) {
            int horseSpeed = horse.getSpeed();
            int tigerSpeed = tiger.getSpeed();
            int dogSpeed = dog.getSpeed();

            System.out.println("\n--- Race Result ---");
            System.out.println("Horse speed: " + horseSpeed);
            System.out.println("Tiger speed: " + tigerSpeed);
            System.out.println("Dog speed: " + dogSpeed);

            if (horseSpeed > tigerSpeed && horseSpeed > dogSpeed) {
                System.out.println("🏆 Winner: " + horse.getName() + " with speed " + horseSpeed);
                break;
            } else if (tigerSpeed > horseSpeed && tigerSpeed > dogSpeed) {
                System.out.println("🏆 Winner: " + tiger.getName() + " with speed " + tigerSpeed);
                break;
            } else if (dogSpeed > horseSpeed && dogSpeed > tigerSpeed) {
                System.out.println("🏆 Winner: " + dog.getName() + " with speed " + dogSpeed);
                break;
            } else {
                System.out.println("No clear winner this round. Rerunning...");
            }
        }

    }
}
