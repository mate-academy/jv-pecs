package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator(1.5));
        list.add(new Excavator(2.0));
        list.add(new Excavator(2.5));
        return list;
    }
}
