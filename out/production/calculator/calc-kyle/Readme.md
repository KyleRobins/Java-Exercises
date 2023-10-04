# Java Calculator Project

## Project Description
This Java program acts as a simple calculator. It prompts the user to enter two numbers and an operator (+, -, *, /, %) to perform the corresponding arithmetic operation. The program then displays the result.

## Requirements
- Use appropriate variable names and follow Java naming conventions.
- Use number operators such as addition, subtraction, multiplication, division, and modulo.
- Utilize the Math library for one of the arithmetic operations.
- Handle string inputs and convert them to the appropriate data types.
- Use boolean operators and logical operators (AND and OR) to validate the operator input.
- Use the `equals()` method to compare strings for operator validation.

## Steps
1. Prompt the user to enter the first number.
2. Read and store the first number in a variable of an appropriate data type.
3. Prompt the user to enter the operator.
4. Read and store the operator as a string.
5. Prompt the user to enter the second number.
6. Read and store the second number in a variable of an appropriate data type.
7. Use an if-else statement or switch statement to perform the arithmetic operation based on the operator entered.
    - If the operator is "+", add the two numbers.
    - If the operator is "-", subtract the second number from the first number.
    - If the operator is "*", multiply the two numbers.
    - If the operator is "/", divide the first number by the second number.
    - If the operator is "%", calculate the remainder when the first number is divided by the second number using the modulo operator.
    - If none of the above operators are entered, display an error message for invalid input.
8. Display the result to the user.

## Example
```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the operator (+, -, *, /, %): ");
        String operator = scanner.nextLine();

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

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

        System.out.println("Result: " + result);
    }
}
