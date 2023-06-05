public class LogFile implements ICalculator{
    private Logger logger;
    private ICalculator calculator;
    public LogFile(Logger logger, ICalculator calculator){
        this.calculator = calculator;
        this.logger = logger;
        logger.log("Первый аргумент равен: " + calculator.getResult());
    }
    @Override
    public ICalculator sum(int secondArg) {
        logger.log("Суммируем " + secondArg);
        return calculator.sum(secondArg);
    }

    @Override
    public ICalculator multi(int secondArg) {
        logger.log("Умножаем " + secondArg);
        return calculator.multi(secondArg);
    }

    @Override
    public ICalculator subtraction(int secondArg) {
        logger.log("Вычитаем " + secondArg);
        return calculator.subtraction(secondArg);
    }

    @Override
    public ICalculator division(int secondArg) {
        logger.log("Делим " + secondArg);
        return calculator.division(secondArg);
    }

    @Override
    public int getResult() {
        int temp = calculator.getResult();
        logger.log("Полученный результат " + temp);
        return temp;
    }
}
