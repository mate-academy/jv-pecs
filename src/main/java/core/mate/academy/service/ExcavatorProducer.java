package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list;

    public ExcavatorProducer() {
        list = new ArrayList<>();
        list.add(new Excavator("Excavator1", "blue", 0.5f, 0.5f));
        list.add(new Excavator("Excavator1", "yellow", 1.0f, 0.75f));
    }

    @Override
    public List<Excavator> get() {
        return list;
    }
}
