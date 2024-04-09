package com.example.indent;

public class NoIndentTextFormatter {

    String noIndentText(String text) {
        return text.replaceAll("(?m)^\\s+", "");
    }
}