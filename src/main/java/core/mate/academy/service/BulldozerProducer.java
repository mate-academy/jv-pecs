package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(332.0));
        bulldozers.add(new Bulldozer(225.4));
        bulldozers.add(new Bulldozer(534.3));
        return bulldozers;
    }
}
