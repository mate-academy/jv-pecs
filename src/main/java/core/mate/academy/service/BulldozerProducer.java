package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final Bulldozer bulldozer = new Bulldozer();
    private final Bulldozer bulldozer2 = new Bulldozer(true, 15, "blue");
    private final Bulldozer bulldozer3 = new Bulldozer(false, 0, "yellow");

    @Override
    public List<Bulldozer> get() {
        return List.of(bulldozer, bulldozer2, bulldozer3);
    }
}
