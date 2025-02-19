package reflaction.intermediatelevel.retrieveannotationatruntime;

import java.lang.annotation.Annotation;

public class RetrieveAnnotations {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflection.retrieveannotationsatruntime.ExampleClass");

            if (clazz.isAnnotationPresent(Author.class)) {
                Annotation annotation = clazz.getAnnotation(Author.class);
                Author author = (Author) annotation;

                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}