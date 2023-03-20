package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private Bulldozer bulldozer1 = new Bulldozer(19.5, 155, "GidroMechanick");
    private Bulldozer bulldozer2 = new Bulldozer(21.7, 133, "GidroStatick");
    private Bulldozer bulldozer3 = new Bulldozer(20.8, 150, "GidroMechanick");

    private List<Bulldozer> bulldozers = List.of(bulldozer1, bulldozer2, bulldozer3);

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
