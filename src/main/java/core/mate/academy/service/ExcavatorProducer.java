package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer<T extends Machine> implements MachineProducer<T> {

    @Override
    public List<? super T> get() {
        List<T> excavators = new ArrayList<>();
        excavators.add((T) new Excavator());
        excavators.add((T) new Excavator());
        return excavators;
    }
}
