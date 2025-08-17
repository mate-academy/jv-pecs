package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Ford", "Red", 1991, 200, 1),
                new Bulldozer("Renault", "White", 2000, 205, 1),
                new Bulldozer("Mitsubishi", "Red", 1998, 300, 2));
    }
}
