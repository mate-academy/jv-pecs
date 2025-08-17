package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "Yellow", 2.5, 15000));
        bulldozers.add(new Bulldozer("Bulldozer2", "Yellow", 3.0, 18000));
        bulldozers.add(new Bulldozer("Bulldozer3", "Yellow", 3.5, 20000));
        return bulldozers;
    }
}
