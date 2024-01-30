package com.livecodebdd.controller;

public class CyclomaticComplexity {
    // Cyclomatic Complexity = 5
    int a, b, c, d;
    public void foo() { // 1, function declaration
        while (a < b // 2, while
                && a > c) {
            return;
        }
        if (a == b) {
            do { // 3, do
                return;
            } while (d);
        } else if (c == d) {
            while (c > 0) { // 4, while
                return;
            }
            do { // 5, do-while
                return;
            } while (a);
        }
    }
}

