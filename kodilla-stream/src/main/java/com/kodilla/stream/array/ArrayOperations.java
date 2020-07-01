package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length);
        OptionalDouble average = IntStream.of(numbers)
                .average();
        return average.getAsDouble();
    }
}
