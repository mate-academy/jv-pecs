package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("First bulldozer", "white", 2001));
        bulldozers.add(new Bulldozer("Second bulldozer", "blue", 2002));
        bulldozers.add(new Bulldozer("Third bulldozer", "red", 2003));
        return bulldozers;
    }
}
