package core.mate.academy.strategy;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        excavator.setColor("blue");
        excavator.setName("excavator");
        List<Excavator> list = new ArrayList<>();
        list.add(excavator);
        return list;
    }
}
