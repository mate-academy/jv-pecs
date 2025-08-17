package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Cat", "orange", 150, 50));
        bulldozers.add(new Bulldozer("Komatsu", "grey", 167, 60));
        bulldozers.add(new Bulldozer("Liebherr", "red", 145, 75));
        return bulldozers;
    }
}
