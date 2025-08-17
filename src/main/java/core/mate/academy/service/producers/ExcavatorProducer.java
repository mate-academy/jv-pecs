package core.mate.academy.service.producers;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("V8 diesel", 30, 2000));
        excavators.add(new Excavator("V12 diesel", 25, 2500));
        return excavators;
    }
}
