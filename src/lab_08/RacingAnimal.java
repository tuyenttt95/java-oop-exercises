package lab_08;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 ## LAB 7.2 Racing animal simple version
 * Horse: Max 75 km/h
 * Tiger: Max 100 km/h
 * Dog: Max 60 km/h
 * Falcon: 120 km/h
 * Snake: 40km/h
 * ---
 * * Create an Animal class with a method speed() which return a **random** speeds
 * * Create 3 objects for those 3 animal type
 * * Run and see which animal is winner for racing
 * * Bonus: Default name with Class variable
 * * Format: `Winner is <Animal name>, with speed: <speed>`
 * * Hints:* * Class name can get from: `object.getClass().getSimpleName();`
 * * ```int randomSpeed = new SecureRandom().nextInt(50);```
 *- Racing animal with builder design pattern (adding attribute flyable)
 * - Eagle = Falcon, Tiger, Snake....
 * ```
 * Animal tiger = new Animal.Builder().withWings(false).....build();
 * Animal falcon = new Animal.Builder().withWings(true).....build();
 */

public class RacingAnimal {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal.Builder()
            .setName("Horse")
            .setMaxSpeed(75)
            .setSpeed(new SecureRandom().nextInt(75))
            .setFlyable(false)
            .build());

        animals.add(new Animal.Builder()
            .setName("Tiger")
            .setMaxSpeed(100)
            .setSpeed(new SecureRandom().nextInt(100))
            .setFlyable(false)
            .build());

        animals.add(new Animal.Builder()
            .setName("Dog")
            .setMaxSpeed(60)
            .setSpeed(new SecureRandom().nextInt(60))
            .setFlyable(false)
            .build());

        animals.add(new Animal.Builder()
            .setName("Falcon")
            .setMaxSpeed(120)
            .setSpeed(new SecureRandom().nextInt(120))
            .setFlyable(true)
            .build());

        animals.add(new Animal.Builder()
            .setName("Snake")
            .setMaxSpeed(40)
            .setSpeed(new SecureRandom().nextInt(40))
            .setFlyable(false)
            .build());

        // List of registered animals (including those that can fly)
        System.out.println("== List of registered animals ==");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
        System.out.println();

        // Filter animals that cannot fly
        List<Animal> raceAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (!animal.isFlyable()) {
                raceAnimals.add(animal);
            }
        }

        // List of animals in the race (non-flyable)
        System.out.println("== List of animals in the race (non-flyable) ==");
        for (Animal animal : raceAnimals) {
            System.out.println(animal.toString());
        }
        System.out.println();

        // Display info of animals in the race
        System.out.println("== List of animals in the race ==");
        for (int i = 0; i < raceAnimals.size(); i++) {
            Animal animal = raceAnimals.get(i);
            System.out.println(animal.toString());
        }

        // Find the animal with the highest speed
        Animal winner = null;
        for (Animal animal : raceAnimals) {
            if (winner == null || animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }

        // Print Winner
        if (winner != null) {
           System.out.println("🏆 Winner: " + winner.getName() + " with speed: " + winner.getSpeed());
        } else {
            System.out.println("No non-flyable animals to race.");
        }
    }
}
