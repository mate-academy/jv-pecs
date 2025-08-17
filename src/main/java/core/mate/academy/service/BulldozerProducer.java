package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(12.1,900.1));
        bulldozers.add(new Bulldozer(12.2,900.2));
        bulldozers.add(new Bulldozer(12.3,900.3));
        return bulldozers;
    }
}
