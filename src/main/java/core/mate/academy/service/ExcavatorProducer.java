package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator());
        excavatorList.add(new Excavator());
        excavatorList.add(new Excavator());
        return excavatorList;
    }
}
