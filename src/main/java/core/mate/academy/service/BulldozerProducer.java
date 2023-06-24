package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return new ArrayList<>(List.of(
                new Bulldozer(23, 9),
                new Bulldozer(20, 7),
                new Bulldozer(25, 11)
        ));
    }
}
