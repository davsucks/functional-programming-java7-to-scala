package com.thoughtworks.jcprogram.functional.exercise.Predicate;

/**
 * Created by dsucksto on 6/26/15.
 */
public class IsGreaterThanFour implements Predicate {
    @Override
    public boolean isTrue(Integer integer) {
        return integer > 4;
    }
}
