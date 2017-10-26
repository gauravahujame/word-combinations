import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testCanCreate(){
        List<String> wordList = Arrays.asList("back", "end", "front", "tree");
        String positiveTest = "backend";
        String negativeTest = "endend";

        assertTrue(Main.can_create(wordList, positiveTest)); // Positive test case
        assertFalse(Main.can_create(wordList, negativeTest)); // Negative test case
    }
}
