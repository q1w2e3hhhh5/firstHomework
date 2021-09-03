import junit.framework.TestCase;

public class StringDrillTest extends TestCase {

    public void testStartsBy() {
        StringDrill str = new StringDrill("hello world");
        assertEquals(str.startsBy("hell"),true);
    }

    public void testNbOfOccurences() {
        StringDrill str = new StringDrill("tututu");
        assertEquals(str.nbOfOccurences("tu"),3);
    }

    public void testSubSplit() {
        StringDrill str = new StringDrill("bob,math,julien,gojo");
       // assertEquals(str.subSplit(2,","),"julien");
        str.subSplit(2,",");
    }


}