package com.generics;

public class MaximumNumberProblem {
   public <E extends Comparable <E>> E findMaximumNumber(E firstValue, E secondValue, E thirdValue) {
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
