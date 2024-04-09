package com.example.indent;

import java.util.stream.Collectors;

public class TextBlockFormatter {
    private final int CODE_TEXT_BLOCK_INDENT = 4;

    String formatLinesToCodeBlockIndent(String code) {
        String indent = " ".repeat(CODE_TEXT_BLOCK_INDENT);
        return code.lines()
                .map(line -> indent + line + "\n")
                .collect(Collectors.joining());
    }
}
