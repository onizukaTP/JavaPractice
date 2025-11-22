package com.javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class NumberPlayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) list.add(i);

        // Method 1: Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
            System.out.println("Iterator: " + it.next());

        // Method 2: Consumer interface
        class MyConsumer implements Consumer<Integer> {
            @Override
            public void accept(Integer integer) {
                System.out.println("Consumer: " + integer);
            }
        }
        MyConsumer action = new MyConsumer();
        list.forEach(action);

        // Method 3: anonymous consumer
        list.forEach(
                new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println("Anonymous consumer: " + integer);
                    }
                }
        );

        // Method 4: lambda
        list.forEach(n -> System.out.println("lambda: " + n));

        // Method 5: convert integer to double using Function interface
        Function<Integer, Double> toDouble = Integer::doubleValue;
        list.forEach(n -> System.out.println("To double: " + toDouble.apply(n)));

        Predicate<Integer> divisibleBy2 = n -> n % 2 == 0;
        Predicate<Integer> divisibleBy3 = n -> n % 3 == 0;
        List<Integer> lst = List.of(1,2,3,4,5,6,7,8,9,10,11,12,18,21,24);
        Predicate<Integer> divisibleBy6 = divisibleBy2.and(divisibleBy3);
        lst.stream().filter(divisibleBy6).forEach(System.out::println);
    }
}
