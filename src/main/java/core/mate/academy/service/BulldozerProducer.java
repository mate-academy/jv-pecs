package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("First bulldozer", "white", 2));
        bulldozers.add(new Bulldozer("Second bulldozer", "blue", 3));
        bulldozers.add(new Bulldozer("Third bulldozer", "red", 4));
        return bulldozers;
    }
}
