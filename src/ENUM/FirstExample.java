package ENUM;

import java.util.*;

enum Operation {
    ADD {
        double apply(double a, double b) { return a + b; }
    },
    SUBTRACT {
        double apply(double a, double b) { return a - b; }
    },
    MULTIPLY {
        double apply(double a, double b) { return a * b; }
    },
    DIVIDE {
        double apply(double a, double b) { return a / b; }
    };

    abstract double apply(double a, double b);
}

public class FirstExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opName = sc.next().toUpperCase();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        Operation op = Operation.valueOf(opName);
        double result = op.apply(a, b);
        System.out.println("Result: " + result);
    }

}

