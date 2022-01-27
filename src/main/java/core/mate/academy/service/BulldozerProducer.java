package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer first = new Bulldozer(2012);
        Bulldozer second = new Bulldozer(2020);
        bulldozers.add(first);
        bulldozers.add(second);

        return bulldozers;
    }
}
