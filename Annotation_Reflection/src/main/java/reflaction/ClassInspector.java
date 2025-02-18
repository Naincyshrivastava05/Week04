package reflaction;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInspector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fully qualified class name: ");
        String className = scanner.nextLine();
        scanner.close();

        inspectClass(className);
    }

    public static void inspectClass(String className) {
        try {
            Class<?> cls = Class.forName(className);

            System.out.println("\nClass Name: " + cls.getName());

            displayConstructors(cls);
            displayFields(cls);
            displayMethods(cls);

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }

    public static void displayConstructors(Class<?> cls) {
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }

    public static void displayFields(Class<?> cls) {
        System.out.println("\nFields:");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    public static void displayMethods(Class<?> cls) {
        System.out.println("\nMethods:");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}

