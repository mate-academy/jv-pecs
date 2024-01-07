package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private static List<Bulldozer> bulldozers = new ArrayList<>();

    public BulldozerProducer() {
        bulldozers.add(new Bulldozer("Hamer", "yellow", 10450));
        bulldozers.add(new Bulldozer("Giant", "yellow", 16200));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
