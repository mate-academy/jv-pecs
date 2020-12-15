package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return new ArrayList<>(List.of(new Bulldozer(1000),
                new Bulldozer(500), new Bulldozer(700)));
    }
}
