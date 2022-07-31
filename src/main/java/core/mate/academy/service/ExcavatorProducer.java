package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator excavator = new Excavator();
        for (int i = 0; i < 3; i++) {
            excavatorList.add(excavator);
        }
        return excavatorList;
    }
}
