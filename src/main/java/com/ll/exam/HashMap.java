package com.ll.exam;

public class HashMap<K,V> {
    private Object[] keys;
    private Object[] values;
    private int size;

    HashMap() {
        size = 0;
        keys = new Object[100];
        values = new Object[100];
    }

    public void put(K key, V value) {
        int index = indexOfKey(key);

        if ( index != -1) {
            values[index] = value;
            return;
        }


        keys[size] = key;
        values[size] = value;

        size++;

    }

    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(keys[i])) {
                return i;
            }
        }

        return -1;
    }


    public V get(K key) {
        int index = indexOfKey(key);

        if (index == -1) {
            return null; //object니까 null
        }
        return (V) values[index];
    }


}
