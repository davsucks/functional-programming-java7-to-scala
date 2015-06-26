package com.thoughtworks.jcprogram.functional.exercise.Operation;

import static java.lang.Math.sqrt;

/**
 * Created by dsucksto on 6/26/15.
 */
public class SquareRoot implements Operation {
    @Override
    public Integer apply(Integer integer) {
        return (int) sqrt(integer);
    }
}
