package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer newBulldozer = new Bulldozer("GT-09", 900);
        Bulldozer oldBulldozer = new Bulldozer("TT-11", 800);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(newBulldozer);
        bulldozers.add(oldBulldozer);
        return bulldozers;
    }
}
