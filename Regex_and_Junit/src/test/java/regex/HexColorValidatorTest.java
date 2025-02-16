package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HexColorValidatorTest {

    @Test
    void testValidHexColors() {
        assertTrue(HexcolorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexcolorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexcolorValidator.isValidHexColor("#1a2b3c"));
        assertTrue(HexcolorValidator.isValidHexColor("#ABCDEF"));
        assertTrue(HexcolorValidator.isValidHexColor("#000000"));
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(HexcolorValidator.isValidHexColor("#123"));     // Too short
        assertFalse(HexcolorValidator.isValidHexColor("FFA500"));   // Missing #
        assertFalse(HexcolorValidator.isValidHexColor("#GGGFFF"));  // Invalid characters
        assertFalse(HexcolorValidator.isValidHexColor("#1234567")); // Too long
        assertFalse(HexcolorValidator.isValidHexColor("#12ABGZ"));  // Contains non-hex characters
    }
}

