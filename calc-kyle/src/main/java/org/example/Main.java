package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        //prompt the user to enter the operator
        System.out.print("Pick operator (+, -, *, /, %: ");
        String operator = scanner.nextLine();
        //prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        //perform the arithmetic operation based on the operator
        double result;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else if (operator.equals("%")) {
            result = num1 % num2;
        } else {
            System.out.println("Invalid operator");
            return;
        }
        //Display the result
        System.out.println("Result: " + result);
    }
}