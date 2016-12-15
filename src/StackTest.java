import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manoel on 15/12/2016.
 */
public class StackTest {
    Stack<Integer> stack;

    @Before
    public void setUp(){
        stack = new Stack<>();
        stack.push(4);
        stack.push(8);
        stack.push(1);
        stack.push(3);
    }

    @Test
    public void push() throws Exception {
        stack.push(10);
        assertEquals((int)stack.peek(), 10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(1);
        stack.push(16);
        stack.push(15);
        assertEquals(15, (int)stack.peek());
    }

    @Test
    public void pop() throws Exception {
        stack.pop();
        assertEquals((int)stack.peek(), 1);
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(null, (int)stack.peek());
        stack.pop();
    }

    @Test
    public void peek() throws Exception {
        assertEquals(3, (int)stack.peek());
    }
}
