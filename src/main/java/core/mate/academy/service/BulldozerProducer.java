package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "yellow", "S"));
        bulldozers.add(new Bulldozer("Volvo", "black", "U"));
        bulldozers.add(new Bulldozer("Komatsu", "yellow", "S"));
        return bulldozers;
    }
}
