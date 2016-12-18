import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Antonio Manoel on 17/12/2016.
 */
public class BinaryTreeTest {

    private BinaryTree binTree;

    @Before
    public void setUp(){
        binTree = new BinaryTree(40);
        binTree.insert(4);
        binTree.insert(35);
        binTree.insert(98);
        binTree.insert(22);
        binTree.insert(62);
        binTree.insert(23);
        binTree.insert(1);
        binTree.insert(36);
        binTree.insert(21);
    }

    @Test
    public void remove() throws Exception {
        binTree.remove(binTree.getRoot(), 98);
        assertEquals(9, binTree.countNodes());
    }

    @Test
    public void minValue(){
        assertEquals(1, binTree.getMinValue());
    }

    @Test
    public void maxValue(){
        assertEquals(98, binTree.getMaxValue());
    }

    @Test
    public void treeDepth(){
        assertEquals(5, binTree.getDepth());
    }

    @Test
    public void countNodes(){
        assertEquals(10, binTree.countNodes());
    }

}