package reflection;



import org.junit.jupiter.api.Test;
import reflaction.intermediatelevel.accessandmodifyprivatefield.Configuration;


import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class ModifyStaticFieldTest {

    @Test
    public void testModifyStaticField() throws Exception {
        Class<?> clazz = Configuration.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "7079732862");

        assertEquals("7079732862", Configuration.getApiKey());
    }
}