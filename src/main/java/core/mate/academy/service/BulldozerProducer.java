package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("bullDozer1", "yellow", "S", false));
        bulldozers.add(new Bulldozer("bullDozer2", "red", "U", true));
        bulldozers.add(new Bulldozer("bullDozer3", "black", "S-U", true));
        return bulldozers;
    }
}
