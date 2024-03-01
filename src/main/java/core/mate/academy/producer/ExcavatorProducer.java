package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(12, 10, 6));
        excavatorList.add(new Excavator(10, 8, 4));
        excavatorList.add(new Excavator(18, 17, 10));
        return excavatorList;
    }
}