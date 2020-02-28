package com.generics;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumberProblem<E extends Comparable<E>> {

    E firstValue;
    E secondValue;
    E thirdValue;

    public MaximumNumberProblem(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public E findMaximumNumber() {
        return findMaximumNumber(firstValue, secondValue, thirdValue);
    }

    public static <E extends Comparable<E>> E findMaximumNumber(E firstValue, E secondValue, E thirdValue, E... optionalArguments) {
        E maxValue = firstValue;
        if (maxValue.compareTo(secondValue) < 0) {
            maxValue = secondValue;
        }
        if (maxValue.compareTo(thirdValue) < 0) {
            maxValue = thirdValue;
        }
        if (optionalArguments.length != 0) {
            Arrays.sort(optionalArguments, Collections.reverseOrder());
            if (maxValue.compareTo(optionalArguments[0]) < 0) {
                maxValue = optionalArguments[0];
            }
        }
        return maxValue;
    }
}
