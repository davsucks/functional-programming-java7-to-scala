package com.thoughtworks.jcprogram.functional.exercise.Predicate;

/**
 * Created by dsucksto on 6/26/15.
 */
public class IsGreaterThanFour<F> implements Predicate {
    @Override
    public boolean isTrue(Object object) {
        return 4 < (int) object;
    }
}
