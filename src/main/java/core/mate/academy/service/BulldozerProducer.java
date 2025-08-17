package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("BulldozerOne", "black", 10);
        Bulldozer bulldozer2 = new Bulldozer("BulldozerTwo", "white", 15);
        Bulldozer bulldozer3 = new Bulldozer("BulldozerThree", "red", 20);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
