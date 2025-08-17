package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Catterpillar", 150000));
        bulldozers.add(new Bulldozer("Zettelmeyer", 170000));
        bulldozers.add(new Bulldozer("Chalenger", 120000));
        return bulldozers;
    }
}
