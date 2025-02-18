package annotation.override;

// Child class overriding makeSound()
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}