package annotation.roleallowedannotation;


import java.lang.reflect.Method;

public class RoleBasedAccessControl {

    public static void invokeMethod(Object obj, String methodName, User user, Object... args) {
        try {
            Method method = obj.getClass().getMethod(methodName, String.class);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                if (!user.getRole().equals(roleAllowed.value())) {
                    System.out.println("Access Denied! User " + user.getUsername() + " does not have permission to execute " + methodName);
                    return;
                }
            }

            method.invoke(obj, args);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}