package annotation.deprecated;



public class LegacyAPI {

    @Deprecated
    public String oldFeature() {
        return "Warning: This feature is deprecated and may be removed in future versions";
    }

    public String newFeature() {
        return "This is the new and improved feature";
    }
}
