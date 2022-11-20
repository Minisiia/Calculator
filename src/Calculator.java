import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double operand1 = random.nextDouble(100);
        double operand2 = random.nextDouble(100);
        System.out.println("Введіть арифметичну дію");
        String sign = scanner.nextLine();
        switch (sign) {
            case "+": {
                System.out.printf("%.2f + %.2f = %.4f", operand1, operand2, (operand1 + operand2));
                break;
            }
            case "-": {
                System.out.printf("%.2f - %.2f = %.4f", operand1, operand2, (operand1 - operand2));
                break;
            }
            case "*": {
                System.out.printf("%.2f * %.2f = %.4f", operand1, operand2, (operand1 * operand2));
                break;
            }
            case "/": {
                if (operand1 == 0 || operand2 == 0) {
                    System.out.println("Помилка! Ділення на 0");
                    break;
                }
                else {
                    System.out.printf("%.2f / %.2f = %.4f", operand1, operand2, (operand1 / operand2));
                    break;
                }
            }
            case "%": {
                System.out.printf("%.2f %% %.2f = %.4f", operand1, operand2, (operand1 % operand2));
                break;
            }
            default: {
                System.out.println("Введена невірна арифметична дія");
                break;
            }
        }

    }
}
