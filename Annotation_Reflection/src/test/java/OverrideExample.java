import static org.junit.jupiter.api.Assertions.*;

import annotation.override.Animal;
import annotation.override.Dog;
import org.junit.jupiter.api.Test;

// Test class
class OverrideExample {

    @Test
    void testAnimalSound() {
        Animal animal = new Animal();
        assertEquals("Animal makes a sound", captureSound(animal));
    }

    @Test
    void testDogSound() {
        Dog dog = new Dog();
        assertEquals("Dog barks", captureSound(dog));
    }

    // Helper method to capture the output
    private String captureSound(Animal animal) {
        // Redirect output stream
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        // Call method
        animal.makeSound();

        // Restore normal output stream
        System.setOut(System.out);

        return out.toString().trim();
    }
}
