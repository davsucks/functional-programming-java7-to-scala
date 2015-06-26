package com.thoughtworks.jcprogram.functional.exercise;

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
        String returnString = "";
        for (Integer number : numbers) {
            if (number > 4) {
                returnString += (int) sqrt(number) + ", ";
            }
        }
        return remove_final_separator_from(returnString);
    }

    private String remove_final_separator_from(String string) {
        return string.substring(0, string.length() -2);
    }

}
