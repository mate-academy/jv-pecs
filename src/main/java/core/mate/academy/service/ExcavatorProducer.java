package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Caterpillar", "White", 10));
        list.add(new Excavator("Daewoo", "Blue", 9));
        list.add(new Excavator("John Deere", "Green", 8));
        return list;
    }
}
