package com.example.switchExpressions;

public class DayService {

    int getDayNumberOfLettersForWorkday(Day day) {
        return switch(day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> day.name().length();
            case SATURDAY , SUNDAY -> throw new IllegalStateException("Weekend is not a working day");
        };
    }
}