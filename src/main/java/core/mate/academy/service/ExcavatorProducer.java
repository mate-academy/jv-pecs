package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorsList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            excavatorsList.add(new Excavator());
        }
        return excavatorsList;
    }
}
