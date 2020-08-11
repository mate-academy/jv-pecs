package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(600, 5500));
        bulldozers.add(new Bulldozer(570, 3400));
        bulldozers.add(new Bulldozer(850, 6600));
        return bulldozers;
    }
}
