package com.sdl.datastructure;

public class HashTableMain {
    public static void main(String[] args) {

        Empolyee gab = new Empolyee("Gabriel", "Simon", 12);
        Empolyee job = new Empolyee("Job", "Ella", 13);
        Empolyee will = new Empolyee("Will", "Grace", 14);
        SimpleHashTable ht = new SimpleHashTable();

        ht.put("Gabriel", gab);
        ht.put("job", job);
        ht.put("will", will);

        ht.printHashTable();

        System.out.println("Retrieve key Gabriel "+ ht.get("Gabriel"));
    }
}
