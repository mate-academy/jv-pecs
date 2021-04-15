package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("First bulldozer", "Yellow", 2020));
        bulldozers.add(new Bulldozer("Second bulldozer", "Purple", 1995));
        bulldozers.add(new Bulldozer("Third bulldozer", "Black", 2000));
        bulldozers.add(new Bulldozer("Fourth bulldozer", "White", 2009));
        return bulldozers;
    }
}
