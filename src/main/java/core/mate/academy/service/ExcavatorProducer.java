package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int EXCZVATOR_QUANTITY = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        for (int i = 0; i < EXCZVATOR_QUANTITY; i++) {
            excavators.add(new Excavator(3000 + i,"Hyundai"));
        }
        return excavators;
    }
}
