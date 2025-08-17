package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "red", 500));
        bulldozers.add(new Bulldozer("Crawler", "green", 700));
        bulldozers.add(new Bulldozer("John Deere", "yellow", 600));
        return bulldozers;
    }
}
