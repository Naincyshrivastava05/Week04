package annotation.customcachingsystem;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler implements InvocationHandler {
    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CacheHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = method.getName() + "(" + (args != null ? args[0] : "") + ")";

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + key);
                return cache.get(key);
            }

            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        }

        return method.invoke(target, args);
    }

    @SuppressWarnings("unchecked")
    public static <T> T createCachedInstance(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class[]{interfaceType},
                new CacheHandler(target)
        );
    }
}
