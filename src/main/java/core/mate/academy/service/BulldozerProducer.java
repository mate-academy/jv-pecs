package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.LinkedList;
import java.util.List;

public interface BulldozerProducer extends MachineProducer<Bulldozer> {
    @Override
    default List<Bulldozer> get() {
        List<Bulldozer> lsBulldozer = new LinkedList<>();
        lsBulldozer.add(new Bulldozer());
        lsBulldozer.add(new Bulldozer());
        lsBulldozer.add(new Bulldozer());
        return lsBulldozer;
    }
}
