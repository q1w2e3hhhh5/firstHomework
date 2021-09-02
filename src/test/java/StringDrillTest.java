import junit.framework.TestCase;

public class StringDrillTest extends TestCase {

    public void testName() {
        StringDrill str = new StringDrill("hello world");
        assertEquals(str.startsBy("h"),true);
    }
}