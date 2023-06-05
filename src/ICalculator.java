public interface ICalculator {
    ICalculator sum(int secondArg);
    ICalculator multi(int secondArg);
    ICalculator subtraction(int secondArg);
    ICalculator division(int secondArg);
    int getResult();
}
