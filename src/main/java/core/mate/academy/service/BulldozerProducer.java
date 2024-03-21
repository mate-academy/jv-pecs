package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Bulldozer1", "yellow", 300);
        Bulldozer bulldozer2 = new Bulldozer("Bulldozer2", "orange", 350);
        Bulldozer bulldozer3 = new Bulldozer("Bulldozer3", "grey", 400);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
