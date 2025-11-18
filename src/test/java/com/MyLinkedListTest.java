package com;

import com.javapractice.dsa.MyLinkedList;
import com.javapractice.dsa.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(50);
        MyNode<Integer> mySecondNode = new MyNode<>(60);
        MyNode<Integer> myThirdNode = new MyNode<>(9);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode); myLinkedList.printNodes();

        boolean result = myLinkedList.getHead().equals(myFirstNode) &&
                myLinkedList.getHead().getNext().equals(mySecondNode) &&
                myLinkedList.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
