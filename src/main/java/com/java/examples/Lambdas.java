package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas {

    public void consumer(){
        Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
        Consumer<String> con2 = (s) -> {System.out.println(s.toLowerCase());};
        con1.andThen(con2).accept("java8");
    }

    public void biConsumer(){
        BiConsumer<Integer, Integer> con1 = (a, b) -> System.out.println("Add" + a+b);
        con1.accept(23, 30);

        List<Integer> list1 = Arrays.asList(new Integer(10), new Integer(10), new Integer(10));
        List<Integer> list2 = Arrays.asList(new Integer(10), new Integer(10), new Integer(10));
        BiConsumer<List<Integer>, List<Integer>> con2 = (l1, l2) ->{
            if(l1.size() == l2.size()){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        };

        con2.accept(list1, list2);
    }

    public void forEach(){
        List<Integer> list2 = Arrays.asList(new Integer(10), new Integer(10), new Integer(10));
        list2.forEach(s ->{
            System.out.println("Number is: "+ s);
        });
    }

    public void predicate(){
        int a = 5;
        Predicate<Integer> lessThan = s -> s >=50;
        lessThan.test(a);
    }


}
