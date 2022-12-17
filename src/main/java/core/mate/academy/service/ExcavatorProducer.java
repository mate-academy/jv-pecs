package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
