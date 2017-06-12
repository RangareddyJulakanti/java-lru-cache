package com.mycompany.app;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LRUCacheTest {
    final int MAX_CAPACITY = 10;
    LRUCache lru;

    @Before
    public void setUp() throws Exception {
        lru = new LRUCache(MAX_CAPACITY);
        lru.set(1, "one");
        lru.set(2, "two");
        lru.set(3, "three");
        lru.set(4, "four");
    }

    @Test
    public void testSize() {
        assertEquals(lru.map.size(), 4);
    }

    @Test
    public void testGetSet() {
        assertEquals(lru.get(2), "two");
        lru.set(2, "CHANGED");
        assertEquals(lru.get(2), "CHANGED");
    }

    @Test
    public void testHead() {
        assertEquals(lru.head.value, "four");
    }

    @Test
    public void testMax() {
        lru.set(5, "five");
        lru.set(6, "six");
        lru.set(7, "seven");
        lru.set(8, "eighth");
        lru.set(9, "nine");
        lru.set(10, "ten");
        lru.set(11, "eleven");
        assertEquals(MAX_CAPACITY, lru.map.size());

        assertEquals("eleven", lru.head.value);
    }

}
