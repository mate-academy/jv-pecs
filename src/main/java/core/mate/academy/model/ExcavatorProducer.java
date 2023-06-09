package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("Excavator 1", 230, "model A"));
        excavatorList.add(new Excavator("Excavator 2", 400, "model B"));
        excavatorList.add(new Excavator("Excavator 3", 500, "model C"));
        return excavatorList;
    }
}
