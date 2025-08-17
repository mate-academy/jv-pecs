package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("D9", "Green", 30),
                new Bulldozer("Sun", "Grey", 25),
                new Bulldozer("Octa", "Blue", 40)
        );
    }
}
