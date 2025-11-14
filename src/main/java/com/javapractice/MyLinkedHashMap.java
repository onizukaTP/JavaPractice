package com.javapractice;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
    private final int numBuckets;
    ArrayList<MyLinkedList<K>> myBucketArray;

    public MyLinkedHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++) {
            this.myBucketArray.add(null);
        }
    }

    public int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode % numBuckets;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        MyLinkedList<K> myLinkedList = myBucketArray.get(index);
        if (myLinkedList == null) return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        return myMapNode == null ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList<>();
            this.myBucketArray.set(index, myLinkedList);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            myLinkedList.add(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyLinkedHashMap{" + myBucketArray + '}';
    }
}
