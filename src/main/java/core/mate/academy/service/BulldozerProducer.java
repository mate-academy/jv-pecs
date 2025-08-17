package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("John Deere 1050K", "green", "S-blade"));
        bulldozers.add(new Bulldozer("Liebherr PR 776", "blue", "Semi-U blade"));
        return bulldozers;
    }
}
