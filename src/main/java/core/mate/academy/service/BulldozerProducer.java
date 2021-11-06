package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("CAT", "Yellow", 320, 12),
                new Bulldozer("Vault", "Purple", 300, 10),
                new Bulldozer("Holden", "Green", 325, 5));
    }
}
