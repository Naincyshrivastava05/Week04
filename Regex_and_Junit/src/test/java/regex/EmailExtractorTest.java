package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class EmailExtractorTest{

    @Test
    void testExtractEmails() {
        String text = "Contact support@example.com, info@company.org, or sales@shop.net.";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(3, emails.size());
        assertTrue(emails.contains("support@example.com"));
        assertTrue(emails.contains("info@company.org"));
        assertTrue(emails.contains("sales@shop.net"));
    }

    @Test
    void testNoEmails() {
        String text = "No emails here, just some random text.";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertTrue(emails.isEmpty());
    }

    @Test
    void testEmailsWithDifferentFormats() {
        String text = "Valid: test.email+alias@gmail.com, user.name@sub.domain.co.uk";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("test.email+alias@gmail.com"));
        assertTrue(emails.contains("user.name@sub.domain.co.uk"));
    }
}
