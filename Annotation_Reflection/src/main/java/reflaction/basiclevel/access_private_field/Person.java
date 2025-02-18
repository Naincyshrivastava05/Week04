package reflaction.basiclevel.access_private_field;

import java.lang.reflect.Field;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}



