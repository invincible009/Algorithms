package com.sdl.datastructure;

public class SimpleHashTable {
    private Empolyee[] hashtable;

    public SimpleHashTable() {
        this.hashtable = new Empolyee[10];// capacity of hash table
    }

    public void put(String key, Empolyee empolyee){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null){
            System.out.println("Sorry,there's already an employee at position "+ hashedKey);
        }
        hashtable[hashedKey] = empolyee;
    }

    public Empolyee get(String key){
        int hashKey = hashKey(key);
        return hashtable[hashKey];
    }

    public void printHashTable(){
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }
}
