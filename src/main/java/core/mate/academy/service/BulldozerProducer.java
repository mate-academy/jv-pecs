package core.mate.academy.service;

import core.mate.academy.interfaces.MachineProducer;
import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "black", 20, 315));
        bulldozers.add(new Bulldozer("Bulldozer2", "red",15, 260));
        bulldozers.add(new Bulldozer("Bulldozer3", "white",25, 365));
        return bulldozers;
    }
}
