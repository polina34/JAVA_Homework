import java.util.Scanner;
import java.util.logging.Logger;

class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Введите первое число: ");
        double num1 = scanner.nextDouble();
        LOGGER.info("Введите второе число: ");
        double num2 = scanner.nextDouble();

        LOGGER.info("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                LOGGER.warning("Ошибка! Выбрана неверная операция.");
                return;
        }

        LOGGER.info(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
