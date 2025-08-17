package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(true, 3.4, 200, 500, "Bulldozer1", "Red"),
                new Bulldozer(false, 4.5, 160,345, "Bulldozer2", "Yellow"),
                new Bulldozer(true, 6.3, 210,435, "Bulldozer3", "Black"));
    }
}
