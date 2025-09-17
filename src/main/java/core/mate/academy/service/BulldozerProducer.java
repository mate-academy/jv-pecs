package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<Bulldozer>();
        bulldozers.add(new Bulldozer("Caterpillar", 15000, 400));
        bulldozers.add(new Bulldozer("Komatsu", 12000, 350));
        bulldozers.add(new Bulldozer("Hitachi", 18000, 420));
        return bulldozers;
    }
}
