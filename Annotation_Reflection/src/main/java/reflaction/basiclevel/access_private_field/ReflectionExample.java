package reflaction.basiclevel.access_private_field;

import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Creating a Person object
            Person person = new Person(25);
            person.displayAge();

            // Getting the Class object
            Class<?> personClass = person.getClass();

            // Accessing the private field "age"
            Field ageField = personClass.getDeclaredField("age");

            // Making the private field accessible
            ageField.setAccessible(true);

            // Retrieving and printing the real value
            System.out.println("Real Age: " + ageField.get(person));

            // Modifying the private field's value
            ageField.set(person, 30);

            // Retrieving and printing the modified value
            System.out.println("Modified Age: " + ageField.get(person));

            // Display the updated age using the method
            person.displayAge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}