package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> excavators = new ArrayList<>();
        excavators.add(new Bulldozer("Hundai", 9200));
        excavators.add(new Bulldozer("XCMG", 7500));
        excavators.add(new Bulldozer("Deere", 10050));
        return excavators;
    }
}
