package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Caterpillar", "Yellow", 600, 10));
        list.add(new Excavator("Volvo", "Red", 550, 9));
        list.add(new Excavator("Hitachi", "Silver", 1000, 15));
        return list;
    }
}
