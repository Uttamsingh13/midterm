package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();

        for (ArithmeticBase.Operation operation : ArithmeticBase.Operation.values()) {
            double result = r.calculate(m, n, operation);
            System.out.println("Result of " + operation + " : " + result);
        }
    }
}
