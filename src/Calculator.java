public class Calculator implements ICalculator {
    private int firstArg;

    public Calculator(int firstArg) {
        this.firstArg = firstArg;
    }

    @Override
    public ICalculator sum(int secondArg) {
        firstArg += secondArg;
        return this;
    }

    @Override
    public ICalculator multi(int secondArg) {
        firstArg *= secondArg;
        return this;
    }

    @Override
    public ICalculator subtraction(int secondArg) {
        firstArg -= secondArg;
        return this;
    }

    @Override
    public ICalculator division(int secondArg) {
        firstArg /= secondArg;
        return this;
    }

    @Override
    public int getResult() {
        return firstArg;
    }
}
