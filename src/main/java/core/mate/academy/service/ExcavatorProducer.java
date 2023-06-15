package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private final List<Machine> excavatorList = new ArrayList<>();

    @Override
    public List<Machine> get() {
        for (int i = 0; i < 3; i++) {
            excavatorList.add(new Excavator());
        }
        return excavatorList;
    }
}
