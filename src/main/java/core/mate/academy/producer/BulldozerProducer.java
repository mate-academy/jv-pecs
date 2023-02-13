package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer burntBulldozer = new Bulldozer();
        Bulldozer newBulldozer = new Bulldozer();
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(burntBulldozer);
        bulldozers.add(newBulldozer);
        return bulldozers;
    }
}
