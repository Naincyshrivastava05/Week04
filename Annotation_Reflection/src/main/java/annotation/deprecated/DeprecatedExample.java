package annotation.deprecated;


public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        System.out.println(api.oldFeature());
        System.out.println(api.newFeature());
    }
}