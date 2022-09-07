package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> excavators = new ArrayList<>();
        excavators.add(new Bulldozer("Deere", 410));
        excavators.add(new Bulldozer("Volvo", 165));
        excavators.add(new Bulldozer("Hyundai", 182));
        return excavators;
    }
}
