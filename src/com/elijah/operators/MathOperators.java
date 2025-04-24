package com.elijah.operators;

public class MathOperators {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        System.out.println("Mathematical operators with numbers " + num1 +" and " + num2);
        // Addition
        System.out.printf("Addition: + operator %d\n", num1 + num2);
        // Subtraction
        System.out.printf("Subtraction: - operator %d\n", num1 - num2);
        // Multiplication
        System.out.printf("Multiplication: * operator %d\n", num1 * num2);
        // Division
        System.out.printf("Division: / operator %d\n", num1 / num2);
        // Modulus
        System.out.printf("Modulus: %% operator %d\n", num1 % num2);
        // Use double for more precise division
        double num3 = 20.0;
        double num4 = 7.0;
        System.out.printf("Precise Division: %f\n", num3 / num4);


    }
}
