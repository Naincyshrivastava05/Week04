package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LicensePlateValidatorTest {

    @Test
    void testValidLicensePlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY9876"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("CD5678"));
    }

    @Test
    void testInvalidLicensePlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345"));  // Only one letter
        assertFalse(LicensePlateValidator.isValidLicensePlate("ABC123"));  // Three letters
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12C4"));  // Contains a non-digit
        assertFalse(LicensePlateValidator.isValidLicensePlate("A1B234"));  // Letters not at the start
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB123"));   // Only three digits
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12345")); // Five digits instead of four
    }
}

