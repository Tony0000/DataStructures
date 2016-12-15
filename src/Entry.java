/**
 * Created by manoel on 15/12/2016.
 */
public class Entry<K, V> {
    private final K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey(){ return key; }

    public V getValue() {
        return value;
    }

    public void setValue(V value){
        this.value = value;
    }
}