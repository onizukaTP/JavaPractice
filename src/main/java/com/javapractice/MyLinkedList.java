package com.javapractice;

public class MyLinkedList<K> {
    private INode<K> head;
    private INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
    }

    public void append(INode<K> newNode) {
        if (newNode == null) {
            return;
        }
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert (INode<K> myNode, INode<K> newNode) {
        INode temp = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(temp);
    }

    public INode<K> search(K key) {
        INode<K> current = this.head;

        while (current != null) {

            K currentKey = current.getKey();

            if (currentKey != null && currentKey.equals(key)) {
                return current;
            }

            current = current.getNext();
        }

        return null;
    }

    public INode<K> pop() {
        INode temp = this.head;
        this.head = head.getNext();
        return temp;
    }

    public INode<K> popLast() {
        INode temp = head;
        while (!temp.equals(tail)) {
            temp = temp.getNext();
        }
        tail = temp;
        temp = temp.getNext();
        return temp;
    }

    public void delete (INode<K> myNode) {
        if (head == null || myNode == null) return;
        if (myNode == head) {
            this.head = myNode.getNext();
        }
        INode current = head;
        while (current.getNext() != null && current.getNext() != myNode) {
            current = current.getNext();
        }
        if (current.getNext() == null) {
            return;
        }
        current.setNext(myNode.getNext());
        if (myNode == tail) {
            this.tail = current;
        }
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void printNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode temp = head;
        while (temp.getNext() != null) {
            myNodes.append(temp.getKey());
            if (!temp.equals(tail)) myNodes.append("-->");
            temp = temp.getNext();
        }
        myNodes.append(temp.getKey());
        System.out.println(myNodes);
    }

    public INode<K> getHead() {
        return head;
    }

    public void setHead(INode<K> head) {
        this.head = head;
    }

    public INode<K> getTail() {
        return tail;
    }

    public void setTail(INode<K> tail) {
        this.tail = tail;
    }
}
