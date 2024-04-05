package com.dcat.interviewprep.hashmap;

import java.util.LinkedList;

/**
 * General HashMap functionality
 * Does not implement Map
 *
 */
public class MyHashMap  {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;

    private LinkedList<MapItem>[] buckets;
    private int size;
    private final double loadFactor;
    private int capacity;

    // Constructor
    public MyHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int initialCapacity, double loadFactor) {
        if (initialCapacity <= 0 || loadFactor <= 0) {
            throw new IllegalArgumentException("Invalid initial capacity or load factor");
        }
        this.capacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.size = 0;
        this.buckets = new LinkedList[capacity];
    }

    private int hash(String key) {
        // hash needs to return a positive number
        return Math.abs(key.hashCode()) % capacity;
    }

    // Helper method to find an entry in the bucket
    private MapItem findEntry(LinkedList<MapItem> bucket, String key) {
        if (bucket == null) {
            return null;
        }
        for (MapItem entry : bucket) {
            if (entry.key.equals(key)) {
                return entry;
            }
        }
        return null;
    }

    // Method to put a key-value pair into the map
    public void put(String key, String value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapItem> bucket = buckets[index];
        MapItem entry = findEntry(bucket, key);
        if (entry != null) {
            entry.value = value;
        } else {
            bucket.add(new MapItem(key, value));
            size++;
            if ((double) size / capacity > loadFactor) {
                resize();
            }
        }
    }

    // Method to get the value associated with a key
    public String get(String key) {
        int index = hash(key);
        LinkedList<MapItem> bucket = buckets[index];
        MapItem entry = findEntry(bucket, key);
        return entry != null ? entry.value : null;
    }

    // Method to remove a key-value pair from the map
    public void remove(String key) {
        int index = hash(key);
        LinkedList<MapItem> bucket = buckets[index];
        if (bucket == null) {
            return;
        }
        MapItem entryToRemove = findEntry(bucket, key);
        if (entryToRemove != null) {
            bucket.remove(entryToRemove);
            size--;
        }
    }

    // Method to resize the map when load factor is exceeded
    private void resize() {
        int newCapacity = capacity * 2;
        LinkedList<MapItem>[] newBuckets = new LinkedList[newCapacity];
        for (LinkedList<MapItem> bucket : buckets) {
            if (bucket != null) {
                for (MapItem entry : bucket) {
                    int newIndex = hash(entry.key) % newCapacity;
                    if (newBuckets[newIndex] == null) {
                        newBuckets[newIndex] = new LinkedList<>();
                    }
                    newBuckets[newIndex].add(entry);
                }
            }
        }
        buckets = newBuckets;
        capacity = newCapacity;
    }
}
