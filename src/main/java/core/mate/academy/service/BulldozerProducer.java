package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("XCMG TY160", "yellow", 135));
        bulldozers.add(new Bulldozer("XCMG TY230G", "amber", 179));
        return bulldozers;
    }
}
