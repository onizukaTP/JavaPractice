package com.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer[] list2 = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(list2));
    }
}
