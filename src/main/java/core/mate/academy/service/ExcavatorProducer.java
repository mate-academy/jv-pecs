package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public static final int SIZE_OF_LIST = 5;

    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
