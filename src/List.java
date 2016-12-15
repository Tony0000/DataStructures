import java.util.Arrays;

/**
 * Created by manoel on 15/12/2016.
 */
public class List<E> {
    private int CAPACITY = 10;
    private Object[] elements;
    private int size = 0;

    public List(){
        elements = new Object[CAPACITY];
    }

    public void add(E e){
        if(size == CAPACITY){
            CAPACITY = resizeList();
        }
        elements[size++] = e;

    }

    public void remove(int position){
        if(position < 0 || position > size)
            throw new IndexOutOfBoundsException("Index "+position+", Size "+size);
        elements[position] = null;
        size--;
        condenseElements(position);
    }

    @SuppressWarnings("unchecked")
    public E get(int position){
        if(position < 0 || position > size)
            throw new IndexOutOfBoundsException("Index "+position+", Size "+size);
        return (E)elements[position];
    }

    public void condenseElements(int start){
        for(int i = start; i < size; i++){
            elements[i] = elements[i+1];
        }
    }

    private int resizeList(){
        int newSize = size*2;
        elements = Arrays.copyOf(elements, newSize);
        return newSize;
    }

}
