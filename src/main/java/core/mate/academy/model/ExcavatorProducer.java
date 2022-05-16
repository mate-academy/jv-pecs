package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<T extends Machine> implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator();
        Excavator thirdExcavator = new Excavator();
        excavatorList.add(firstExcavator);
        excavatorList.add(secondExcavator);
        excavatorList.add(thirdExcavator);
        return excavatorList;
    }
}
