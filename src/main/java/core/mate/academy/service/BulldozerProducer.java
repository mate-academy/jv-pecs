package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer first = new Bulldozer(true, "medium", "First", "White");
        Bulldozer second = new Bulldozer(false, "high", "Second", "Black");
        Bulldozer third = new Bulldozer(true, "low", "Third", "Red");
        bulldozers.add(first);
        bulldozers.add(second);
        bulldozers.add(third);
        return bulldozers;
    }
}
