package com.example.stringMethods;

import java.util.List;

public class StringService {

    List<String> getOnlyNotBlankStrings(List<String> input) {
        return input.stream().filter(s -> !s.isBlank()).toList();
    }

    List<String> getStrippedTextLines(String text) {
        return text.lines().map(String::strip).toList();
    }

    List<String> extendFoundStringByRepeatSomeTimes(List<String> list, String searchedText, int nTimesRepeat) {
        return list.stream().map(s -> s.equals(searchedText) ? s.repeat(nTimesRepeat) : s).toList();
    }
}
