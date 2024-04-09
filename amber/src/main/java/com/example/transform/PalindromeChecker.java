package com.example.transform;

public class PalindromeChecker {

    boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}
