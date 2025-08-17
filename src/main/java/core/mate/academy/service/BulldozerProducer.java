package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(3000, 150));
        bulldozers.add(new Bulldozer(4000, 200));
        bulldozers.add(new Bulldozer(5500, 400));
        return bulldozers;
    }
}
