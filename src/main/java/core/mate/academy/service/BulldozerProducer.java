package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer("Cat", "Orange", 1000);
        bulldozers.add(bulldozer);
        return bulldozers;
    }
}
