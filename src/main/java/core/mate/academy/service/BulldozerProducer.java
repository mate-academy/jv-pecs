package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(
                new Bulldozer("Bulldozer_1", "White", "T-150"),
                new Bulldozer("Bulldozer_2", "Green", "T-230"),
                new Bulldozer("Bulldozer_3", "Blue", "T-50")
        );
    }
}
