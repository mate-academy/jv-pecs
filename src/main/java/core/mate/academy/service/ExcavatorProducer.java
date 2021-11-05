package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator num1 = new Excavator("Excavator-E734b","Blue-Red",
                6.4,15.5,"Dutch Roader");
        Excavator num2 = new Excavator("Excavator-UBA-34","Green-Yellow",
                3.8,8.6,"Turkish Bridge Builder");
        Excavator num3 = new Excavator("Excavator CruelDeeper", "Black-White",
                19.8, 50,"Equador Dinamics");
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(num1);
        excavatorList.add(num2);
        excavatorList.add(num3);
        return excavatorList;
    }
}
