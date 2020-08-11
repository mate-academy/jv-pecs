package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorFactory implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator(5545845, 789, "disel"));
        list.add(new Excavator(6848548, 500, "gas"));
        list.add(new Excavator(9870005, 300, "butan"));
        return list;
    }
}
