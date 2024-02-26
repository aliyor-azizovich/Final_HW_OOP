package JavaIntermediateCert.view;

import JavaIntermediateCert.basis.ComplexCalculableBasis;
import JavaIntermediateCert.model.Calculable;
import JavaIntermediateCert.model.ComplexNumber;

import java.util.Scanner;

public class ViewCalculator {

    private ComplexCalculableBasis calculableFactory;

    public ViewCalculator(ComplexCalculableBasis calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            ComplexNumber primaryArg = promptComplexNumber("Введите комплексное число (как a+bi): ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второе комплексное число (a+bi): ");
                    calculator.multi(arg);
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("%.2f+%.2fi\n", result.getReal(), result.getImaginary());
                    break;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второе комплексное число (a+bi): ");
                    calculator.sum(arg);
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("%.2f+%.2fi\n", result.getReal(), result.getImaginary());
                    break;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второе комплексное число (a+bi): ");
                    calculator.div(arg);
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("%.2f+%.2fi\n", result.getReal(), result.getImaginary());
                    break;
                }
            }
            String cmd = prompt("Что бы продолжить вычисления нажмите +, что бы остановить программу нажмитте -)?");
            if (cmd.equals("+")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String input = in.nextLine();
        String[] parts = input.split("\\+");
        double real = Double.parseDouble(parts[0]);
        double imaginary = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
        return new ComplexNumber(real, imaginary);
    }
}
