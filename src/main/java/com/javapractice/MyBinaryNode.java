package com.javapractice;

public class MyBinaryNode<K> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
