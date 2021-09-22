package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer("Komatsu", "yellow"));
        bulldozers.add(new Bulldozer("Caterpillar", "white"));
        bulldozers.add(new Bulldozer("John Deere", "green"));
        return bulldozers;
    }
}
