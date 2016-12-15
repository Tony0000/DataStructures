import org.junit.Test;
import org.junit.Before;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by manoel on 15/12/2016.
 */
public class HashMapTest {

    HashMap<String, Integer> map;

    @Before
    public void setUp() {
        map = new HashMap<>();
        map.add("Test1", 1);
        map.add("Test2", 2);
        map.add("Test3", 3);
    }

    @Test
    public void get() {
        assertEquals(map.get("Lars"), null);
        assertEquals((int)map.get("Test3"), 3);
    }

    @Test
    public void remove() {
        map.remove("Test2");
        assertEquals(map.getSize(), 2);
        map.remove("Lars");
        assertEquals(map.getSize(), 2);
    }

    @Test
    public void getKeySet() {
        Set<String> set = map.getKeySet();
        assertEquals(set.size(), 3);
    }

    @Test
    public void getSize() {
        assertEquals(map.getSize(), 3);
        map.add("Lars", 4);
        assertEquals(map.getSize(), 4);
    }
}
