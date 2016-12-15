import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by manoel on 15/12/2016.
 */
public class HashMap<K, V> {

    private int size = 0;
    private final int DEFAULT_CAPACITY = 16;
    @SuppressWarnings("unchecked")
    private Entry<K, V>[] elements = new Entry[DEFAULT_CAPACITY];

    public HashMap(){
    }

    public void add(K key, V value){
        boolean inserted = false;
        for(int i = 0; i < size; i++)
            if(elements[i].getKey().equals(key)){
                elements[i].setValue(value);
                size++;
                inserted = true;
            }
        if(!inserted){
                ensureResize();
                elements[size++] = new Entry<K, V>(key, value);
        }

    }

    public V get(K key){
        for(int i = 0; i < size; i++){
            if(elements[i].getKey().equals(key))
                return elements[i].getValue();
        }
        return null;
    }

    private void ensureResize(){
        if(size == elements.length){
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    private void condenseElements(int start){
        for(int i = start; i < size; i++){
            elements[i] = elements[i+1];
        }
    }

    public void remove(K key){
        for(int i = 0; i < size; i++){
            if(elements[i].getKey().equals(key)){
                elements[i] = null;
                size--;
                condenseElements(i);
            }
        }
    }

    public Set<K> getKeySet(){
        Set<K> keys = new HashSet<K>();
        for(int i = 0; i < size; i++){
            keys.add(elements[i].getKey());
        }
        return keys;
    }

    public int getSize(){ return size; }

}
