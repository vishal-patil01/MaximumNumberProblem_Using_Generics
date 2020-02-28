package com.generics;

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

    public E findMaximumNumber(E firstValue, E secondValue, E thirdValue) {
        E maxValue = firstValue;
        if (maxValue.compareTo(secondValue) < 0) {
            maxValue = secondValue;
        }
        if (maxValue.compareTo(thirdValue) < 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
}
