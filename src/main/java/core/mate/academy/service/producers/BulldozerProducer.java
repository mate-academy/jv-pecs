package core.mate.academy.service.producers;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("V6 diesel", 40, false));
        bulldozers.add(new Bulldozer("Electrical", 35, true));
        return bulldozers;
    }
}
