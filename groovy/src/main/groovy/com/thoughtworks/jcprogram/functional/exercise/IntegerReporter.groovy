package com.thoughtworks.jcprogram.functional.exercise

import static java.lang.Math.sqrt

// Given a list of numbers like {1, 9, 4, 16, 4}
// Print the square root of all of the numbers larger than 4.
// For example, "3, 4"

List numbers = [1, 9, 4, 16, 4]

println("------------ Groovy: IntegerReporter ------------")
println new IntegerReporter().reportSquareRootsOfLargeNumbers(numbers)

def reportSquareRootsOfLargeNumbers(numbers){
    numbers.findAll {cat -> cat > 4}.collect {cat -> (int) sqrt(cat)}.join(", ")
}