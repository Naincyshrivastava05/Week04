package reflaction.intermediatelevel.accessandmodifyprivatefield;



import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Configuration.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Original API_KEY: " + Configuration.getApiKey());

        field.set(null, "7079732862");

        System.out.println("Modified API_KEY: " + Configuration.getApiKey());
    }
}