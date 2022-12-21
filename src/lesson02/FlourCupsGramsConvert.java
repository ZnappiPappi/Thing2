package lesson02;

import helpers.Keyboard;

/**
 * Write a program that accepts cups as user input and outputs equivalent in grams
 * 1 Cup of Flour = 1 * COEFFICIENT * FLOUR_DENSITY
 * N Cup of Flour = N * COEFFICIENT * FLOUR_DENSITY
 */
public class FlourCupsGramsConvert {
    public static void main(String[] args) {
    
    // FLOUR_DENSITY = 0.762
    final double FLOUR_DENSITY = 0.762;
    // COEFFICIENT = 236.588
    final double COEFFICIENT = 236.588;

    // Input
    System.out.println("Enter the number of cup to flour: ");
    int numberOfCups = Keyboard.readInt();

    // Process
    double flourInGrams = numberOfCups * FLOUR_DENSITY * COEFFICIENT;

    // Output
    System.out.println(flourInGrams + " grams");
    }
}
