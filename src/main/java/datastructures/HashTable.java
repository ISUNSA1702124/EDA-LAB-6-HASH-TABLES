package datastructures;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.function.BiFunction;
import java.util.function.Function;


public class HashTable<K, V> extends Hashtable<K,V> {

    private ArrayList<V> innerHashTable;

    public HashTable(int initialCapacity) {
        this.innerHashTable = new ArrayList<>(initialCapacity);
    }

    public HashTable() {
        //TODO implement here
    }

    @Override
    public synchronized int size() {
        //TODO implement here
        return 0;
    }

    @Override
    public synchronized boolean isEmpty() {
        //TODO implement here
        return false;
    }

    @Override
    public synchronized boolean contains(Object value) {
        //TODO implement here
        return false;
    }

    @Override
    public synchronized V get(Object key) {
        //TODO implement here
        return null;
    }

    @Override
    public synchronized V put(K key, V value) {
        //TODO implement here
        //you should call here computeIfAbsent, computeIfPresent or compute
        return null;
    }

    @Override
    public synchronized V remove(Object key) {
        //TODO implement here
        return null;
    }

    /**
     * To consider, the remapping function is the hash function
     *
     * Read official documentation to check when use the following methods
     * https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html
     *
     * You should use the following methods to compute a hash function,
     * you can choose and design any hash function e.g. linear probing , quadratic probing, double hashing, ...
     *
     * Note: See example of Bifunction in Main class
     */

    @Override
    public synchronized V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        //TODO implement here
        return null;
    }

    @Override
    public synchronized V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        //TODO implement here
        return null;
    }

    @Override
    public synchronized V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        //TODO implement here
        return null;
    }

}
