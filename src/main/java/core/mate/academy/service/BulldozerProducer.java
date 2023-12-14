package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Crawler", "Yellow", 2));
        bulldozers.add(new Bulldozer("Mini", "Yellow", 1));
        bulldozers.add(new Bulldozer("S-U", "Red", 3));
        return bulldozers;
    }
}
