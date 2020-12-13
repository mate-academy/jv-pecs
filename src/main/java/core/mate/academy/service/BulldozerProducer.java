package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("HANOMAG", "yellow", 20));
        bulldozers.add(new Bulldozer("Caterpillar", "black", 15));
        return bulldozers;
    }
}
