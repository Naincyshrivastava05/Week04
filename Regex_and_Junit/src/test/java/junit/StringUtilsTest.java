package junit;
import  org.junit.jupiter.api.Test;
import  static  org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testReverse(){
        assertEquals("ycniaN", StringUtils.reverse("Naincy") );
    }
    @Test
    public void testPalindrom(){
        assertEquals(true, StringUtils.isPalindrom("aba"));
        assertEquals(false, StringUtils.isPalindrom("naincy"));
    }
    @Test
    public void testToUpperCase(){
        assertEquals("NAINCY", StringUtils.toUpperCase("naincy"));
    }
}
