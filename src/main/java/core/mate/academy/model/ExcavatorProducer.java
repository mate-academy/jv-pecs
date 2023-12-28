package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(3, 10));
        excavatorList.add(new Excavator(5, 20));
        excavatorList.add(new Excavator(6, 50));
        return excavatorList;
    }
}
