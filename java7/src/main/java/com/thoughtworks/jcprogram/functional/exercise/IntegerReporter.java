package com.thoughtworks.jcprogram.functional.exercise;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;
import static java.util.Arrays.asList;

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

public class IntegerReporter {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 9, 4, 16, 4);

        System.out.println("------------ Java 7: IntegerReporter ------------");
        System.out.println(new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers));

    }

    public String reportSquareRootsOfLargeNumbers(List<Integer> numbers) {
        List<Integer> new_numbers = apply_if(numbers, new Predicate(), new Operation());
        return joinWithCommas(new_numbers);
    }

    private String joinWithCommas(List<Integer> new_numbers) {
        String returnString = "";
        for (Integer new_number : new_numbers) {
            returnString += new_number + ", ";
        }
        return remove_final_separator_from(returnString);
    }

    private String remove_final_separator_from(String string) {
        return (string.length() > 2) ? string.substring(0, string.length() - 2) : string;
    }

    private List<Integer> apply_if(List<Integer> original, Predicate predicate, Operation operation) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer integer : original) {
            if (predicate.isTrue(integer)) {
                newList.add(operation.apply(integer));
            }
        }
        return newList;
    }

    private class Predicate {
        public boolean isTrue(Integer integer) {
            return integer > 4;
        }
    }

    private class Operation {
        public Integer apply(Integer integer) {
            return (int) sqrt(integer);
        }
    }
}
