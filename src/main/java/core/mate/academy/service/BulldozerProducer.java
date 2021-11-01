package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("MyLovelyBulldozer1", "green", 100, 1000));
        bulldozers.add(new Bulldozer("MyLovelyBulldozer2", "blue", 1000, 10000));
        bulldozers.add(new Bulldozer("MyLovelyBulldozer3", "violet", 500, 5000));
        return bulldozers;
    }
}
