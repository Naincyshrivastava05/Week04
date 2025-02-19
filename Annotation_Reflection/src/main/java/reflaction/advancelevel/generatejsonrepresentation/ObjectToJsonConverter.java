package reflaction.advancelevel.generatejsonrepresentation;



import java.lang.reflect.Field;

public class ObjectToJsonConverter {
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        Class<?> clazz = obj.getClass();
        StringBuilder jsonBuilder = new StringBuilder("{");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            try {
                Object value = field.get(obj);
                jsonBuilder.append("\"").append(field.getName()).append("\":");

                if (value instanceof String) {
                    jsonBuilder.append("\"").append(value).append("\"");
                } else {
                    jsonBuilder.append(value);
                }

                if (i < fields.length - 1) {
                    jsonBuilder.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
