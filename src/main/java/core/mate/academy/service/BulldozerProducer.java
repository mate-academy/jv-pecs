package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("First","red", 500.0, 1000, 600.0),
                new Bulldozer("Second", "white", 450.0, 900, 550.0),
                new Bulldozer("Third", "blue", 600.0, 1100, 750.0));
    }
}
