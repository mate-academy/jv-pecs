package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = List.of(
                new Bulldozer("bulldozer 1", "green", "non-rotating"),
                new Bulldozer("bulldozer 2", "black", "rotating"));
        return bulldozers;
    }
}
