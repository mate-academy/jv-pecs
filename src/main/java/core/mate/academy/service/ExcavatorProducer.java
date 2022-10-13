package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorsList = new ArrayList<>();
        excavatorsList.add(new Excavator(100));
        excavatorsList.add(new Excavator(150));
        excavatorsList.add(new Excavator(200));
        return excavatorsList;
    }
}
