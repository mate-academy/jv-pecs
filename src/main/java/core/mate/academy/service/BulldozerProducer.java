package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer(140, 10, "T-130");
        Bulldozer bulldozer3 = new Bulldozer(160, 8, "T-170");
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
