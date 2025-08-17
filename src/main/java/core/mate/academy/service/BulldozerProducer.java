package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("first", "gray", "V1"));
        bulldozers.add(new Bulldozer("second", "orange", "V2"));
        bulldozers.add(new Bulldozer("last", "purple", "V3"));
        return bulldozers;
    }
}
