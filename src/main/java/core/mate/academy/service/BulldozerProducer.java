package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(10, "One"));
        bulldozers.add(new Bulldozer(15, "Two"));
        bulldozers.add(new Bulldozer(20, "Three"));
        return bulldozers;
    }
}
