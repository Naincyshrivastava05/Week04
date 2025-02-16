package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class LinkExtractorTest {

    @Test
    void testExtractValidLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://www.google.com"));
        assertTrue(links.contains("http://example.org"));
    }

    @Test
    void testNoLinks() {
        String text = "There are no links in this text.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertTrue(links.isEmpty());
    }

    @Test
    void testMixedTextWithLinks() {
        String text = "Check out https://www.openai.com, it's a great site!";
        List<String> links = LinkExtractor.extractLinks(text);

        assertEquals(1, links.size());
        assertTrue(links.contains("https://www.openai.com"));
    }
}
