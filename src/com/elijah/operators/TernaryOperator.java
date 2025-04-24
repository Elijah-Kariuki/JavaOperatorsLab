package com.elijah.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        String hasArgs = args.length == 0 ? "No arguments passed" : args[0];
        System.out.printf("hasArgs: %s\n", hasArgs);

    }
}
