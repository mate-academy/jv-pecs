package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Mull", "Black", 200));
        bulldozers.add(new Bulldozer("Donk", "Pink", 300));
        bulldozers.add(new Bulldozer("Kong", "Yellow", 400));
        return bulldozers;
    }
}
