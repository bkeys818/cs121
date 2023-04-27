//******************************************************************
//  Activity 30
//  Name: Ben Keys
//  Data Structures Date: 03/27/2023
//******************************************************************
//  A demonstration of hash maps.
//******************************************************************

import java.util.HashMap;

public class HashMapDemo <K, V> {
    private HashMap<K, V> hashMap = new HashMap<>();

    public void add(K key, V value) {
        hashMap.put(key, value);
    }

    public void remove(K key) {
        hashMap.remove(key);
    }
    public void remove(K key, V value) {
        hashMap.remove(key, value);
    }

    public void get(K key) {
        hashMap.get(key);
    }

    public void display() {
        System.out.println("Hash map:");
        hashMap.forEach( (key, value) -> {
            System.out.printf("\t%s: %s%n", key, value);
        });
    }
}
