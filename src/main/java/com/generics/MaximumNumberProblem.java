package com.generics;

public class MaximumNumberProblem {
    public Integer findMaximumNumber(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer maxValue = firstValue;
        if (maxValue.compareTo(secondValue) < 0) {
            maxValue = secondValue;
        }
        if (maxValue.compareTo(thirdValue) < 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
    public Float findMaximumNumber(Float firstValue, Float secondValue, Float thirdValue) {
        Float maxValue = firstValue;
        if (maxValue.compareTo(secondValue) < 0) {
            maxValue = secondValue;
        }
        if (maxValue.compareTo(thirdValue) < 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
    public String findMaximumNumber(String firstValue, String secondValue, String thirdValue) {
        String maxValue = firstValue;
        if (maxValue.compareTo(secondValue) < 0) {
            maxValue = secondValue;
        }
        if (maxValue.compareTo(thirdValue) < 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }
}
