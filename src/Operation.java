import java.util.Scanner;

public class Operation {
    private ICalculateFactory calculateFactory;
    public Operation(ICalculateFactory calculateFactory){this.calculateFactory = calculateFactory;}

    public void run(){
    while (true){
        int firsArg = printInt("Введите первый аргумент: ");
        ICalculator calculator = calculateFactory.create(firsArg);
        while (true){
            String cmd = print("Введите операцию +, -, *, /, =");

            if (cmd.equals("+")) {
                int arg = printInt("Введите аргумент: ");
                calculator.sum(arg);
                continue;
            }
            if (cmd.equals("-")) {
                int arg = printInt("Введите аргумент: ");
                calculator.subtraction(arg);
                continue;
            }
            if (cmd.equals("*")) {
                int arg = printInt("Введите аргумент: ");
                calculator.multi(arg);
                continue;
            }
            if (cmd.equals("/")) {
                int arg = printInt("Введите аргумент: ");
                calculator.division(arg);
                continue;
            }
            if(cmd.equals("=")) {
                int result = calculator.getResult();
                System.out.printf("Результат %d\n", result);
                break;
            }
        }
            String cmd = print("Продолжить подсчёт? N/Y?");
            if (cmd.equals("Y") || cmd.equals("y"))
                continue;
            break;

    }

    }
    private int printInt(String massage){
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println(massage);
            try {
                return Integer.parseInt(in.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Введите число!");
            }
        }
    }
    private String print(String massage){
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }

}
