package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator(40, 500, "KKK"));
        list.add(new Excavator());
        list.add(new Excavator(700, 50, "DJI"));
        return list;
    }
}
