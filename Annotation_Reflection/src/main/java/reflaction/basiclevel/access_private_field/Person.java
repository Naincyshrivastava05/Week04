package reflaction.basiclevel.access_private_field;

import java.lang.reflect.Field;

public class Person {
    String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayAge() {
        System.out.println("Name:"+name);
        System.out.println("Age: " + age);
    }
}



