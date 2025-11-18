package com.javapractice.dsa;

public class MyBinaryTree<K extends Comparable<K>> {
    MyBinaryNode<K> root;

    public void add(K key) {
        root = addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
    }

    public int getSize() {
        return getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + getSizeRecursive(current.left)
                                        + getSizeRecursive(current.right);
    }
}
