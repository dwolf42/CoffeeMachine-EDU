class SimpleCalculator {

    public static void subtractTwoNumbers(long a, long b) {
        long minuend = a;
        long subtrahend = b;
        long result;

        result = minuend - subtrahend;

        System.out.println(result);
    }

    public static void sumTwoNumbers(long a, long b) {
        long summand1 = a;
        long summand2 = b;
        long result;

        result = summand1 + summand2;

        System.out.println(result);
    }

    public static void divideTwoNumbers(long a, long b) {
        long dividend = a;
        long divisor = b;
        long result;

        if (divisor != 0) {
            result = dividend / divisor;
            System.out.println(result);
        } else {
            System.out.println("Division by 0!");
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        long multiplier = a;
        long multiplicand = b;
        long result;

        result = multiplier * multiplicand;

        System.out.println(result);
    }

    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}


public class Main {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch(operator) {
            case "^":
                SimpleCalculator.power(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
