package reflection;

import org.junit.jupiter.api.Test;
import reflaction.intermediatelevel.retrieveannotationatruntime.Author;


import java.lang.annotation.Annotation;
import static org.junit.jupiter.api.Assertions.*;

public class RetrieveAnnotationsTest {

    @Test
    public void testAnnotationRetrieval() throws Exception {
        Class<?> cls = Class.forName("reflection.retrieveannotationsatruntime.ExampleClass");

        assertTrue(cls.isAnnotationPresent(Author.class));

        Annotation annotation = cls.getAnnotation(Author.class);
        Author author = (Author) annotation;

        assertEquals("Abhishek Kumar", author.name());
    }
}
