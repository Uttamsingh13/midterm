package arithmetic;

public class ArithmeticBase {
    public double x, y;

    enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation");
        }
    }
}
