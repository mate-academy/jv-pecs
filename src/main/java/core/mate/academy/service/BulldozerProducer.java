package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer("Caterpillar", "Yellow", 3.2);
    private Bulldozer bulldozer2 = new Bulldozer("Komatsu", "Orange", 3.0);
    private Bulldozer bulldozer3 = new Bulldozer("John Deere", "Red", 3.1);

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
