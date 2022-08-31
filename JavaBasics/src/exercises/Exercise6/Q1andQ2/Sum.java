package exercises.Exercise6.Q1andQ2;

public class Sum implements IMathOperation, IShowOperation {

    @Override
    public float calculation(float a, float b) {
        return a + b;
    }

    @Override
    public String showOperationName() {
        return "Sum";
    }

    @Override
    public String showOperationSymbol() {
        return "+";
    }

}
