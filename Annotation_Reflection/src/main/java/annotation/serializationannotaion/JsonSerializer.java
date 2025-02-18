package annotation.serializationannotaion;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    public static String toJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, Object> jsonMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), field.get(obj)); // Use custom key name
            }
        }

        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\": ")
                    .append("\"").append(entry.getValue()).append("\", ");
        }

        if (json.length() > 1) {
            json.setLength(json.length() - 2);
        }
        json.append("}");

        return json.toString();
    }
}
