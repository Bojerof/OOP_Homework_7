public class Main {
    public static void main(String[] args) {
        ICalculateFactory calculateFactory = new CalculateFactory();
        ICalculateFactory calcFactory = new CalcFactory(calculateFactory, new Logger("text.txt"));
        Operation operation = new Operation(calcFactory);
        operation.run();
    }
}