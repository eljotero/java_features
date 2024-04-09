package com.example.transform;

public class ImportedCSVTextProcessor {

    String process(String line) {
        line = line.replace(",", " ");
        line = line.replace("none", "");
        line = line.trim();
        line = line + "-done";
        line = line.toUpperCase();

        return line;
    }
}
