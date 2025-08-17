package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Lumper", "red", 2012));
        bulldozerList.add(new Bulldozer("Mitsubishi", "grey", 2010));
        bulldozerList.add(new Bulldozer("Jump", "black", 2011));
        return bulldozerList;
    }
}
