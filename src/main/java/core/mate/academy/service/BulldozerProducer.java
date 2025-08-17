package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bull1", "red", "M"));
        bulldozers.add(new Bulldozer("bull2", "yellow", "S"));
        bulldozers.add(new Bulldozer("bull3", "blue", "L"));
        return bulldozers;
    }
}
