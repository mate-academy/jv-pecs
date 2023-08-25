package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer<T extends Bulldozer> implements MachineProducer<T> {

    @Override
    public List<T> get() {
        return (List<T>) List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
    }
}
