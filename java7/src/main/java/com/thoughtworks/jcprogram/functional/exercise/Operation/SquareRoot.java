package com.thoughtworks.jcprogram.functional.exercise.Operation;

import static java.lang.Math.sqrt;

/**
 * Created by dsucksto on 6/26/15.
 */
public class SquareRoot<T> implements Operation {
    @Override
    public Integer apply(Object object) {
        return (int) sqrt((int) object);
    }
}
