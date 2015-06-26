package com.thoughtworks.jcprogram.functional.exercise;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        System.out.println("------------ Java 8: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));
    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        List<Integer> blah = numbers.stream().filter(number -> number > 4).collect(Collectors.<Integer>toList());
        List<Integer> sqrted = blah.stream().map(number -> (int) sqrt(number)).collect(Collectors.<Integer>toList());
        return sqrted.stream().map(Object::toString).collect(joining(", "));

    }

}
