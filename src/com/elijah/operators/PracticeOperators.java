package com.elijah.operators;

public class PracticeOperators {
    public static void main(String[] args) {
        // Initialize an int array with 10 elements
        int[] numbers = {12, 8, 25, 5, 4, 3, 18, 6, 17, 4};

        // Apply mathematical operations on index pairs
        System.out.printf("Addition (index 0 & 1): %d + %d = %d\n", numbers[0], numbers[1], numbers[0] + numbers[1]);
        System.out.printf("Subtraction (index 2 & 3): %d -%d = %d\n", numbers[2], numbers[3], numbers[2] - numbers[3]);
        System.out.printf("Multiplication (index 4 & 5): %d * %d = %d\n", numbers[4], numbers[5], numbers[4] * numbers[5]);
        System.out.printf("Division (index 6 & 7): %d / %d = %d\n", numbers[6], numbers[7], numbers[6] / numbers[7]);
        System.out.printf("Modulus (index 8 & 9): %d %% %d = %d\n", numbers[8], numbers[9], numbers[8] % numbers[9]);


        System.out.println("\nRelational + Ternary Operator Comparison:");
        // Use a loop with relational and ternary operators
        for (int i = 0; i < numbers.length -1; i++) {
            String result = (numbers[i] > numbers[i + 1]) ? "greater than" :
                            (numbers[i] < numbers[i + 1]) ? "less than" : "equal to";

            System.out.printf("Element at index %d (%d) is %s element at index %d (%d)\n", i, numbers[i], result, i + 1, numbers[i + 1]);
        }

    }
}
