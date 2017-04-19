import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davidshinabarger on 4/19/17.
 */

public class MainTest {

    @Test
    public void doesAnnReturnTrue() throws Exception {
        boolean expected = true;
        boolean actual = Main.palindrome("anna");
        assertEquals(expected, actual);

    }
    @Test
    public void doesFrankReturnFalse() throws Exception {
        boolean expected = false;
        boolean actual = Main.palindrome("frank");
        assertEquals(expected, actual);

    }

    @Test
    public void doesTheReturnFalse() throws Exception {
        boolean expected = false;
        boolean actual = Main.palindrome("the");
        assertEquals(expected, actual);

    }

    @Test
    public void doesAReturnTrue() throws Exception {
        boolean expected = true;
        boolean actual = Main.palindrome("a");
        assertEquals(expected, actual);

    }

}