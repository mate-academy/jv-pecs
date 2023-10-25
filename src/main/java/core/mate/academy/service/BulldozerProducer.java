package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldozer1", "Yellow", "Crawler", "Straight"));
        bulldozers.add(new Bulldozer("Bulldozer2", "Red", "Wheel", "Universal"));
        return bulldozers;
    }
}
