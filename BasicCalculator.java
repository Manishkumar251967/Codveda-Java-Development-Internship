import java.util.Scanner;

public class BasicCalculator {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;

            case '-':
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;

            case '*':
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;

            case '/':
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
