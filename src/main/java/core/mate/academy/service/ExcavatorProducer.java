package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MAX_NUMBER = 3;

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < MAX_NUMBER; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
