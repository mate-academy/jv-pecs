package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("FirstExcavator", "Black"));
        list.add(new Excavator("SecondExcavator", "White"));
        list.add(new Excavator("ThirdExcavator", "Red"));
        return list;
    }
}
