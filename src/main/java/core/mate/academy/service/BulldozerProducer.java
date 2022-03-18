package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("bull", "black", 1000);
        Bulldozer bulldozer2 = new Bulldozer("dozer", "red", 1500);
        Bulldozer bulldozer3 = new Bulldozer("super dozer", "white", 200);
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
