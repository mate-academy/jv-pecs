package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<? extends Machine> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        excavatorList.add(excavator3);
        return excavatorList;
    }
}
