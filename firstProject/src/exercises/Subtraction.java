package exercises;

public class Subtraction implements IMathOperation, IShowOperation {

    @Override
    public float calculation(float a, float b) {
        return a - b;
    }

    @Override
    public String showOperationName() {
        return "Subtraction";
    }

    @Override
    public String showOperationSymbol() {
        return "-";
    }

}
