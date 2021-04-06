package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private final Bulldozer bulldozer1 = new Bulldozer();
    private final Bulldozer bulldozer2 = new Bulldozer();
    private final Bulldozer bulldozer3 = new Bulldozer();

    private final List<Bulldozer> bulldozers = List.of(bulldozer1, bulldozer2, bulldozer3);

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
