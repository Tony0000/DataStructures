import java.util.Arrays;

/**
 * Created by manoel on 15/12/2016.
 */
public class Stack<E> {

    private int CAPACITY = 10;
    private int size = 0;
    private Object elements[] = new Object[CAPACITY];

    public void push(E e){
        if(size == CAPACITY){
            CAPACITY = resizeStack();
        }
        elements[size++] = e;
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

    private int resizeStack(){
        int newSize = size*2;
        elements = Arrays.copyOf(elements, newSize);
        return newSize;
    }
}
