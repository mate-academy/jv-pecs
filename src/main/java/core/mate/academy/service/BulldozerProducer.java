package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = List.of(
                new Bulldozer("bulldozer1","black", 20),
                new Bulldozer("bulldozer2","blue", 30),
                new Bulldozer("bulldozer3","grey", 40));
        return bulldozers;
    }
}
