package reflaction.advancelevel.dependencyinjection;



import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DependencyInjector {
    private final Map<Class<?>, Object> instanceCache = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        Object instance = clazz.getDeclaredConstructor().newInstance();
        instanceCache.put(clazz, instance);
    }

    public void injectDependencies(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = instanceCache.get(fieldType);
                if (dependency == null) {
                    dependency = fieldType.getDeclaredConstructor().newInstance();
                    instanceCache.put(fieldType, dependency);
                }
                field.setAccessible(true);
                field.set(object, dependency);
            }
        }
    }
}
