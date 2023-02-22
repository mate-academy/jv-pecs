package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < PRODUCTION_AMOUNT; i++) {
            excavatorList.add(new Excavator(true, false));
        }
        return excavatorList;
    }
}
