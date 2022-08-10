package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(2,120));
        excavatorList.add(new Excavator(5,300));
        excavatorList.add(new Excavator(1,500));
        return excavatorList;
    }
}
