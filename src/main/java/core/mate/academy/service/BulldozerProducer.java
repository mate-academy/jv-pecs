package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer 1", "black", 4);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer 2", "pink", 8);
        Bulldozer bulldozer3 = new Bulldozer("Bulldozer 3", "purple", 6);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
