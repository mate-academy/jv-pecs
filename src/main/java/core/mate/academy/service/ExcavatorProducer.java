package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.enums.Color;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Long-Reach Excavator",
                Color.WHITE.name(), 2007));
        list.add(new Excavator("Dragline Excavator",
                Color.BLACK.name(), 2017));
        list.add(new Excavator("Suction Excavator",
                Color.WHITE.name(), 1997));
        return list;
    }
}
