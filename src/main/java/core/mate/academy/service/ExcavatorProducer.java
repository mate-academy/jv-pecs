package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    public static final int PRODUCTION_AMOUNT = 3;

    @Override
    public List<Machine> get() {
        List<Machine> excavatorList = new ArrayList<>();
        for (int i = 0; i < PRODUCTION_AMOUNT; i++) {
            excavatorList.add(new Excavator());
        }
        return excavatorList;
    }
}
