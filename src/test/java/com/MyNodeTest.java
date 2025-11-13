package com;

import com.javapractice.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(50);
        MyNode<Integer> mySecondNode = new MyNode<>(60);
        MyNode<Integer> myThirdNode = new MyNode<>(9);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                myFirstNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
