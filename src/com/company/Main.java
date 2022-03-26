package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        symmetricDifference();
    }

    public static void symmetricDifference(){
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> difference = new HashSet<>();
        difference.addAll(set1);
        difference.addAll(set2);
        difference.removeAll(intersection);

        System.out.println("Symmetric difference: " + difference);
    }
}
