package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(1000));
        excavatorList.add(new Excavator(1400));
        excavatorList.add(new Excavator(1200));
        return excavatorList;
    }
}
