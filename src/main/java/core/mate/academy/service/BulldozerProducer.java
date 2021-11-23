package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bulldozer1", "yellow", "Сutting", true));
        bulldozers.add(new Bulldozer("bulldozer2", "red", "Dentate", false));
        bulldozers.add(new Bulldozer("bulldozer3", "black", "Сombined", true));
        return bulldozers;
    }
}
