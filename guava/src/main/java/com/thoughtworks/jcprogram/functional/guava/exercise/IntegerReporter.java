package com.thoughtworks.jcprogram.functional.guava.exercise;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicate;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Collections2.filter;
import static com.google.common.collect.Collections2.transform;
import static com.google.common.collect.Lists.newArrayList;
import static java.lang.Math.sqrt;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = newArrayList(1, 9, 4, 16, 4);

        System.out.println("------------ Guava: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));
    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        Collection<Integer> filteredList = filter(numbers, new Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return input > 4;
            }
        });
        filteredList = transform(filteredList, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer input) {
                return (int) sqrt(input);
            }
        });
        return Joiner.on(", ").join(filteredList);
    }
}
