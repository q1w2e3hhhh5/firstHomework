import junit.framework.TestCase;

public class StringDrillTest extends TestCase {

    public void testStartsBy() {
        StringDrill str = new StringDrill("hello world");
        assertEquals(str.startsBy("hell"),true);
    }

    public void testStartsByNull() {
        StringDrill str = new StringDrill("hello world");
        try{
            str.startsBy(null);
        }catch (IllegalArgumentException e){
            return;
        }
        fail();
    }

    public void testStartsByEmpty() {
        StringDrill str = new StringDrill("hello world");
        try{
            str.startsBy("");
        }catch (IllegalArgumentException e){
            return;
        }
        fail();
    }

    public void testNbOfOccurences() {
        StringDrill str = new StringDrill("tututu");
        assertEquals(str.nbOfOccurences("tu"),3);
    }
    public void testNbOfOccurencesEmpty() {
        StringDrill str = new StringDrill("tututu");
        try{
            str.nbOfOccurences("");
        }catch (IllegalArgumentException e){
            return;
        }
        fail();
    }

    public void testNbOfOccurencesNull() {
        StringDrill str = new StringDrill("tututu");
        try{
            str.nbOfOccurences(null);
        }catch (IllegalArgumentException e){
            return;
        }
        fail();
    }

    public void testSubSplit() {
        StringDrill str = new StringDrill("bob,math,julien,gojo");
        assertEquals(str.subSplit(2,","),"julien");
    }

    public void testSubSplitTwoEmptyDelims() {
        StringDrill str = new StringDrill("bob,math,,julien,gojo");
        assertEquals(str.subSplit(2,","),"");
    }

    public void testSubSplitLastElement() {
        StringDrill str = new StringDrill("bob,math,julien,gojo");
        assertEquals(str.subSplit(3,","),"gojo");
    }

    public void testSubSplitFirstElement() {
        StringDrill str = new StringDrill("bob,math,julien,gojo");
        assertEquals(str.subSplit(0,","),"bob");
    }

    public void testSubSplitNull() {
        StringDrill str = new StringDrill("bob,math,julien,gojo");
        try{
            str.subSplit(0,null);
        }catch (IllegalArgumentException e){
            return;
        }
        fail();
    }

    public void testSubSplitNegativeNumber() {
        StringDrill str = new StringDrill("bob,math,julien,gojo");
        try{
            str.subSplit(-1,",");
        }catch (IllegalArgumentException e){
            return;
        }
        fail();
    }


}