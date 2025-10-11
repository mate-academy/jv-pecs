package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("CAT D11", 7.5, 850, true),
                new Bulldozer("Komatsu D475", 6.8, 890, false)
        );
    }
}
