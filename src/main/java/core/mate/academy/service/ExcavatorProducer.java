package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator first = new Excavator(2, 5);
        Excavator second = new Excavator(3, 6);
        List<Excavator> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        return list;
    }
}
