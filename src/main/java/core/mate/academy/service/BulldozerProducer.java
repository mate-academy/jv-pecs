package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers = List.of(new Bulldozer(), new Bulldozer());

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
