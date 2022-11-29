package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private final Bulldozer bulldozer1 = new Bulldozer();
    private final Bulldozer bulldozer2 = new Bulldozer(140, 10, "T-130");
    private final Bulldozer bulldozer3 = new Bulldozer(160, 8, "T-170");

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
