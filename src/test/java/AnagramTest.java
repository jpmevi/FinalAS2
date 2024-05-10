import org.example.AnagramChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {

    @Test
    public void testAnagrams() {
        assertTrue(AnagramChecker.areAnagrams("espada", "pesada"));
        assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
        assertFalse(AnagramChecker.areAnagrams("hello", "world"));
    }
}