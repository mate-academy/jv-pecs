package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private Excavator firstExcavator = new Excavator();
    private Excavator secondExcavator = new Excavator();
    private Excavator thirdExcavator = new Excavator();

    @Override
    public List<Machine> get() {
        List<Machine> list = new ArrayList<>();
        list.add(firstExcavator);
        list.add(secondExcavator);
        list.add(thirdExcavator);
        return list;
    }
}
