package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("red", 70));
        bulldozers.add(new Bulldozer("green", 65));
        bulldozers.add(new Bulldozer("yellow", 87));
        return bulldozers;
    }
}
