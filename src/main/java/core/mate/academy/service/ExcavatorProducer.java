package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        Excavator excavator = new Excavator();
        excavator.setTypeExcavator("Heavy");
        Excavator excavator1 = new Excavator();
        excavator1.setSize(25);
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator);
        excavatorList.add(excavator1);
        return excavatorList;
    }
}
