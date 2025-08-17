package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer first = new Bulldozer();
        Bulldozer second = new Bulldozer();
        Bulldozer third = new Bulldozer();
        bulldozers.add(first);
        bulldozers.add(second);
        bulldozers.add(third);
        return bulldozers;
    }
}
