package reflection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import reflaction.basiclevel.ClassInspector;

class ClassInspectorTest{
    @Test
    void testInspectClass(){
        assertDoesNotThrow(() -> ClassInspector.inspectClass("java.lang.String"));
    }

    @Test
    void testInspectClassNotFound(){
        assertThrows(ClassNotFoundException.class, () -> Class.forName("non.existing.Class"));
    }

    @Test
    void testDisplayConstructors(){
        assertDoesNotThrow(() -> ClassInspector.displayConstructors(String.class));
    }

    @Test
    void testDisplayFields(){
        assertDoesNotThrow(() -> ClassInspector.displayFields(String.class));
    }

    @Test
    void testDisplayMethods(){
        assertDoesNotThrow(() -> ClassInspector.displayMethods(String.class));
    }
}

