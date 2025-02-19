package reflaction.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("reflection.dynamicallycreateobjects.Student");

            Object obj1 = cls.getDeclaredConstructor().newInstance();
            System.out.println("Object created using default constructor:");
            ((Student) obj1).displayInfo();

            Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
            Object obj2 = constructor.newInstance("Muskan", 22);
            System.out.println("Object created using parameterized constructor:");
            ((Student) obj2).displayInfo();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
