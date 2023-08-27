package core.mate.academy.specificimp;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int SPECIFIC_LIST = 10;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < SPECIFIC_LIST; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
