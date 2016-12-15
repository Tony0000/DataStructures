import java.util.Arrays;

/**
 * Created by manoel on 15/12/2016.
 */
public class Stack<E> {

    private final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object elements[] = new Object[DEFAULT_CAPACITY];

    public void push(E e){
        if(size != DEFAULT_CAPACITY){
            elements[size++] = e;
        }
        else{
            resizeStack();
            elements[size++] = e;
        }
    }

    @SuppressWarnings("unchecked")
    public E pop(){
        if(size > 0){
            E e = (E) elements[size];
            elements[size--] = null;
            return e;
        }else{
            return null;
        }

    }

    @SuppressWarnings("unchecked")
    public E peek(){
        return (size > 0) ?(E)elements[size-1] : null;

    }

    private void resizeStack(){
        elements = Arrays.copyOf(elements, size*2);
    }
}
