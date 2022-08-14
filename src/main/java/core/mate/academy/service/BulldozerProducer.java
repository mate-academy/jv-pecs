package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Crawler", "U Type Blade"));
        bulldozers.add(new Bulldozer("Wheel", "Straight Blades"));
        bulldozers.add(new Bulldozer("Crawler", "Semi-U Blade"));
        return bulldozers;
    }
}
