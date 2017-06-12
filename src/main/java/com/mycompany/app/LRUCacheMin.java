package com.mycompany.app;

import java.util.LinkedHashMap;

public class LRUCacheMin extends LinkedHashMap<Integer, String> {
    private int cacheSize;

    public LRUCacheMin(int size) {
        super(size, 0.75f, true);
        this.cacheSize = size;
    }

    @Override
    protected boolean removeEldestEntry(
            java.util.Map.Entry<Integer,String> eldest) {
        // remove the oldest element when size limit is reached
        return size() > cacheSize;
    }
}