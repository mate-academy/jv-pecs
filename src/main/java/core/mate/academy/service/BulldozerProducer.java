package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer 1", "red");
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer 2", "green");
        Bulldozer bulldozer3 = new Bulldozer("Bulldozer 3", "blue");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
