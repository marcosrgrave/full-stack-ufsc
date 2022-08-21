package exercises;

public class Multiply implements IMathOperation, IShowOperation {

    @Override
    public float calculation(float a, float b) {
        return a * b;
    }

    @Override
    public String showOperationName() {
        return "Multiply";
    }

    @Override
    public String showOperationSymbol() {
        return "*";
    }

}
