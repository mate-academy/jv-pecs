package core.mate.academy.service.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList();
        excavatorList.add(new Excavator("Ex1", "yello", 120));
        excavatorList.add(new Excavator("Ex2", "green", 121));
        excavatorList.add(new Excavator("Ex3", "y", 12));
        excavatorList.add(new Excavator("Ex4", "g", 11));
        return excavatorList;
    }
}
