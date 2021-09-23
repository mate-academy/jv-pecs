package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<? extends Machine> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator(100));
        list.add(new Excavator(250));
        list.add(new Excavator(500));
        return list;
    }
}
