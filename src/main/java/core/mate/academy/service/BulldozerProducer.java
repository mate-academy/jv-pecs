package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer newBulldozer1 = new Bulldozer(2, 20);
        Bulldozer newBulldozer2 = new Bulldozer(3, 15);
        Bulldozer newBulldozer3 = new Bulldozer(4, 10);
        return List.of(newBulldozer1, newBulldozer2, newBulldozer3);
    }
}
