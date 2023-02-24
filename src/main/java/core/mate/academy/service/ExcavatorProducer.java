package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public String getClassName() {
        return Excavator.class.toString();
    }

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < MACHINE_NUMBER_FOR_CREATE; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
