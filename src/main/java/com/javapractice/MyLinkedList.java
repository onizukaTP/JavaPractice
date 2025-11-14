package com.javapractice;

public class MyLinkedList {
    private INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
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

    public INode getHead() {
        return head;
    }

    public void setHead(INode head) {
        this.head = head;
    }

    public INode getTail() {
        return tail;
    }

    public void setTail(INode tail) {
        this.tail = tail;
    }
}
