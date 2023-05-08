package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bulldozer1","black", 20));
        bulldozers.add(new Bulldozer("bulldozer2","blue", 30));
        bulldozers.add(new Bulldozer("bulldozer3","grey", 40));
        return bulldozers;
    }
}
