package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("B1", "red", 10, 10, 10, 10);
        Bulldozer bulldozer2 = new Bulldozer("B2", "green", 20, 20, 20, 20);
        Bulldozer bulldozer3 = new Bulldozer("B3", "blue", 30, 30, 30, 30);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
