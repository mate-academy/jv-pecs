package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = List.of(
                new Bulldozer("Iveco", "White", 1998),
                new Bulldozer("Renault", "Black", 2000),
                new Bulldozer("Liebherr", "Green", 2001)
        );
        return bulldozers;
    }
}
