package JavaIntermediateCert.basis;

import JavaIntermediateCert.model.Logable;
import JavaIntermediateCert.model.Calculable;
import JavaIntermediateCert.model.ComplexCalculator;
import JavaIntermediateCert.model.ComplexNumber;
import JavaIntermediateCert.model.LogCalculator;


public class LogCalculableBasis implements ComplexCalculableBasis {
    private Logable logable;

    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logable);
    }

    public LogCalculableBasis(Logable logable) {
        this.logable = logable;
    }
}
