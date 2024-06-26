package org.katrin;

public class Calculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Enter 3 numbers: the first operand, operator, the second operand!");
            return;
        }

        double firstOper, secondOper;
        String operator = args[1];

        try {
            firstOper = Double.parseDouble(args[0]);
            secondOper = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number: " + e.getMessage());
            return;
        }

        double result;

        switch (operator) {
            case "+":
                result = firstOper + secondOper;
                break;
            case "-":
                result = firstOper - secondOper;
                break;
            case "x":
                result = firstOper * secondOper;
                break;
            case "/":
                if (secondOper == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = firstOper / secondOper;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.print(firstOper + " " + operator + " " + secondOper + " = " + result);
    }
}