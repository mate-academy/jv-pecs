package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("First", "White", "098"));
        list.add(new Excavator("Second", "Black", "a08"));
        list.add(new Excavator("Third", "Red", "777"));
        return list;
    }
}
