package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length);
        double average = IntStream.of(numbers)
                .average().orElse(0);

        return average;
    }
}
