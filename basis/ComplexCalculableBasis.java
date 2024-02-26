package JavaIntermediateCert.basis;

import JavaIntermediateCert.model.Calculable;
import JavaIntermediateCert.model.ComplexNumber;

public interface ComplexCalculableBasis {
    Calculable create(ComplexNumber primaryArg);
}
