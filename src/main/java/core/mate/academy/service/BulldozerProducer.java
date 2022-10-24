package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozer0 = new Bulldozer();
    private final Bulldozer bulldozer1 = new Bulldozer(true, false, 8);
    private final Bulldozer bulldozer2 = new Bulldozer(false, true, 6);

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozer0, bulldozer1, bulldozer2);
    }
}
