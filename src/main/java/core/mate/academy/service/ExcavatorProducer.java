package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Machine> excavatorList = new ArrayList<>();

    public ExcavatorProducer() {
        excavatorList.add(new Excavator());
        excavatorList.add(new Excavator());
        excavatorList.add(new Excavator());
    }

    @Override
    public List<Machine> get() {
        if (excavatorList.isEmpty()) {
            return null;
        }
        return excavatorList;
    }
}
