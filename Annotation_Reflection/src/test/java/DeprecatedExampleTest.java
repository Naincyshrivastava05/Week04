

import static org.junit.jupiter.api.Assertions.*;

import annotation.deprecated.LegacyAPI;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DeprecatedExampleTest {

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();


        assertTrue(api.newFeature().contains("This is the new and improved feature"));
    }

    @Test
    @SuppressWarnings("deprecation")
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        assertTrue(api.oldFeature().contains("Warning: This feature is deprecated and may be removed in future versions"));
    }
}