package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> retVal = new ArrayList<>();
        retVal.add(new Bulldozer("Cat", "Yellow", 100.0));
        retVal.add(new Bulldozer("Dodge", "Black", 200.0));
        return retVal;
    }
}
