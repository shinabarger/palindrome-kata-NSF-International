import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davidshinabarger on 4/19/17.
 */

public class MainTest {

    @Test
    public void palindrome() throws Exception {
        boolean expected = true;
        boolean actual = Main.palindrome("anna");
        assertEquals(expected, actual);

    }

}