package exercises;

public class Division implements IMathOperation, IShowOperation {

    @Override
    public float calculation(float a, float b) {
        return a / b;
    }

    @Override
    public String showOperationName() {
        return "Division";
    }

    @Override
    public String showOperationSymbol() {
        return "/";
    }

}
