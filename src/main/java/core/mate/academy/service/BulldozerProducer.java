package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<? extends Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer("bulldozer 1", "green", "middle", 1.2, 4.0);
        Bulldozer bulldozer2 = new Bulldozer("bulldozer 2", "yellow", "low", 1.0, 3.5);
        Bulldozer bulldozer3 = new Bulldozer("bulldozer 3", "red", "heavy", 2.0, 6.0);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
