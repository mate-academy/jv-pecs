package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<T> implements MachineProducer<T> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        for (int i = 0; i < AMOUNT_TO_CREATE; i++) {
            list.add(new Excavator());
        }
        return list;
    }
}
