package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(450, 500));
        bulldozers.add(new Bulldozer(560, 550));
        bulldozers.add(new Bulldozer(750, 600));
        return bulldozers;
    }
}
