package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(2000, "Steve"));
        bulldozers.add(new Bulldozer(2005, "John"));
        bulldozers.add(new Bulldozer(2003, "Jack"));
        return bulldozers;
    }
}
