public class CalculateFactory implements ICalculateFactory{
    @Override
    public ICalculator create(int firstArg) {
        return new Calculator(firstArg);
    }
}
