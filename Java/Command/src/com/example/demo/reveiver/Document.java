package com.example.demo.reveiver;

import java.util.Stack;

public class Document {
    private Stack<String> lines = new Stack<>();

    public void write(String text) {
        lines.push(text);
    }

    public void eraseLast() {
        if (!lines.isEmpty()) {
            lines.pop();
        }
    }

    public void readDocument() {
        if (lines.isEmpty()) {
            System.out.println("EMPTY");
        }
        lines.stream().forEach(System.out::println);
    }
}
