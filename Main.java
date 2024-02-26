package JavaIntermediateCert;

import JavaIntermediateCert.basis.ComplexCalculableBasis;
import JavaIntermediateCert.basis.LogCalculableBasis;
import JavaIntermediateCert.model.ConsoleLogger;
import JavaIntermediateCert.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ComplexCalculableBasis calculableFactory = new LogCalculableBasis(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }

}
