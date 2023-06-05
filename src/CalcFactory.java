public class CalcFactory implements ICalculateFactory {
    private final ICalculateFactory calculateFactory;
    private final Logger logger;
    public CalcFactory(ICalculateFactory calculateFactory, Logger logger){
        this.calculateFactory = calculateFactory;
        this.logger = logger;
    }

    @Override
    public ICalculator create(int firstArg) {
        return new LogFile(logger ,calculateFactory.create(firstArg));
    }
}
