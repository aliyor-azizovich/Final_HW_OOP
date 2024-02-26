package JavaIntermediateCert.basis;

import JavaIntermediateCert.model.Calculable;
import JavaIntermediateCert.model.ComplexCalculator;
import JavaIntermediateCert.model.ComplexNumber;

public class CalculableBasis implements ComplexCalculableBasis {
    public Calculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}