package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("DT-75", "yellow", 2009, 6));
        bulldozers.add(new Bulldozer("T-100", "yellow", 1977, 10));
        bulldozers.add(new Bulldozer("TM-10", "yellow", 1997, 20));
        return bulldozers;
    }
}
