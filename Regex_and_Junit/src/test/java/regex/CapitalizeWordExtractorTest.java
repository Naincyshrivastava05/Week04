package regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CapitalizeWordExtractorTest {

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertEquals(7, words.size());
        assertTrue(words.contains("Eiffel"));
        assertTrue(words.contains("Tower"));
        assertTrue(words.contains("Paris"));
        assertTrue(words.contains("Statue"));
        assertTrue(words.contains("Liberty"));
        assertTrue(words.contains("New"));
        assertTrue(words.contains("York"));
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this is a lowercase sentence.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertTrue(words.isEmpty());
    }

    @Test
    void testMixedCaseSentence() {
        String text = "Python Java C++ are programming languages, and the USA is a country.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertEquals(5, words.size());
        assertTrue(words.contains("Python"));
        assertTrue(words.contains("Java"));
        assertTrue(words.contains("C"));
        assertTrue(words.contains("USA"));
        assertTrue(words.contains("A")); // 'A' in C++
    }
}
