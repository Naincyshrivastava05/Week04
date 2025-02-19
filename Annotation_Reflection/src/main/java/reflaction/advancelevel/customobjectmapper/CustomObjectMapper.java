package reflaction.advancelevel.customobjectmapper;



import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> cls, Map<String, Object> properties) {
        try {
            T instance = cls.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = cls.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(instance, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("Warning: Field " + fieldName + " not found in class " + cls.getSimpleName());
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to map properties to object", e);
        }
    }
}