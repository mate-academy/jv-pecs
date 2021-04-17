package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<T extends Machine> implements MachineProducer {

    @Override
    public List<? super T> get() {
        List<T> bulldozers = new ArrayList<>();
        bulldozers.add((T) new Bulldozer());
        bulldozers.add((T) new Bulldozer());
        return bulldozers;
    }
}
