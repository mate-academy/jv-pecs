package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Mull", "Black", 200),
                new Bulldozer("Donkey", "Pink", 300),
                new Bulldozer("Kong", "Yellow", 400));
    }
}
