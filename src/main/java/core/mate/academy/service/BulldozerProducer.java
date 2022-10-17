package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = List.of(new Bulldozer("buldozer1", "black", 10),
                new Bulldozer("buldozer2", "white", 20),
                new Bulldozer("buldozer3", "grey", 30));
        return bulldozers;
    }
}
