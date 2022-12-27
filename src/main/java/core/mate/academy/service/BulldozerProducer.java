package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private Bulldozer bulldozer1 = new Bulldozer(1, "diesel");
    private Bulldozer bulldozer2 = new Bulldozer(2, "diesel");
    private Bulldozer bulldozer3 = new Bulldozer(3, "gasoline");

    private List<Bulldozer> bulldozers = List.of(bulldozer1, bulldozer2, bulldozer3);

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
