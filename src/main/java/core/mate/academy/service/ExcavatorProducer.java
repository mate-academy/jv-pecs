package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> newList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Excavator excavator = new Excavator();
            newList.add(excavator);
        }
        return newList;
    }
}
