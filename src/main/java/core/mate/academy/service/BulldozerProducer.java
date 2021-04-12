package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<T extends Bulldozer> implements MachineProducer<T> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Caterpillar", "yellow", "U"));
        bulldozers.add(new Bulldozer("Liebherr", "red", "S"));
        bulldozers.add(new Bulldozer("Komatsu", "green", "S-U"));
        return bulldozers;
    }
}
