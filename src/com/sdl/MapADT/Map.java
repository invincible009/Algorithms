package com.sdl.MapADT;
import java.util.Map.Entry;


//methods exposed by the  map ADT
public interface Map<K,V> {
    int size();
    V get(K key);
    V remove(K key);
    V put(K key, V value);
    boolean isEmpty();
    Iterable<K> keySet();
    Iterable<V> values();
    Iterable<Entry<K,V>> entrySet();

}
