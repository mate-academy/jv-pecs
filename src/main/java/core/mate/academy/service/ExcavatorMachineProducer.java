package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorMachineProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Excavator("Model " + (int)(Math.random() * 100), i));
        }
        return list;
    }
}
