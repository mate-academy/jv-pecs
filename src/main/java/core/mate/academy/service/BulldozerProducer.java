package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        ArrayList<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("FR3", "Green", 37));
        bulldozers.add(new Bulldozer("FR2", "Green", 33));
        bulldozers.add(new Bulldozer("FR6", "Yellow", 32));
        return bulldozers;
    }
}
