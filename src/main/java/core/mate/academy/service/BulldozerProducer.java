package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("small", "Ruslan", "Green"));
        bulldozers.add(new Bulldozer("big", "Father", "Black"));
        bulldozers.add(new Bulldozer("medium", "Bastard", "White"));
        return bulldozers;
    }
}
