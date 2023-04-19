package com.example.codingpractice;

public class ReverseName {
    public static void main(String[] args) {

        printTest("Van-Dame Claud");
        printTest("Victor Hugo");
        printTest("Anna");
        printTest("");

    }

    private static void printTest(String S) {

        System.out.printf("Reverse name for %s: %s\n", S, reverseName(S));

    }
    public static String reverseName (String name) {

        name = name.trim();

        StringBuilder reversedNameBuilder = new StringBuilder();
        StringBuilder subNameBuilder = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {

            char currentChar = name.charAt(i);

            if (currentChar != ' ' && currentChar != '-') {
                subNameBuilder.append(currentChar);
            } else {
                reversedNameBuilder.insert(0, currentChar + subNameBuilder.toString());
                subNameBuilder.setLength(0);
            }

        }

        return reversedNameBuilder.insert(0, subNameBuilder.toString()).toString();

    }
}
