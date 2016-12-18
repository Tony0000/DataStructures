import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manoel on 15/12/2016.
 */
public class ListTest {
    List<String> sampleList;

    @Before
    public void setUp(){
        sampleList = new List<>();
        sampleList.add("Perpermint");
        sampleList.add("Orange");
        sampleList.add("Strawberry");
        sampleList.add("Banana");
    }
    @Test
    public void add(){
        sampleList.add("Apple");
        assertEquals("Apple", sampleList.get(4));
    }

    @Test
    public void remove(){
        sampleList.remove(2);
        assertEquals("Banana", sampleList.get(2));
    }

    @Test
    public void get() {
        assertEquals(sampleList.get(1), "Orange");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getOutOfBounds(){
        sampleList.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeOutOfBounds(){
        sampleList.remove(-1);
    }

}