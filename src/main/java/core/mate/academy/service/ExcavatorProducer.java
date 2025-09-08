package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("CAT 320", "Red", 9000.0, 8.0));
        list.add(new Excavator("Hitachi ZX350", "Green", 11000.0, 10.0));
        return list;
    }
}
