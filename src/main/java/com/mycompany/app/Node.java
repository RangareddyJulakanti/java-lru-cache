package com.mycompany.app;

public class Node{
    int key;
    Object value;
    Node pre;
    Node next;

    public Node(int key, Object value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}