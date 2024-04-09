package com.example.streamToList;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {

    List<Integer> getEvenNumbers(List<Integer> allNumbers) {
        return allNumbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}
