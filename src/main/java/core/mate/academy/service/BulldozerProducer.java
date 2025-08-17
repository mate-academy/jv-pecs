package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(45, "S blade"));
        bulldozers.add(new Bulldozer(60, "U blade"));
        bulldozers.add(new Bulldozer(75, "S-U"));
        return bulldozers;
    }
}
