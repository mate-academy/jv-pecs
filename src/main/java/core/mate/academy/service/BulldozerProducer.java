package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Alfa", "Red", true, 3.0));
        bulldozers.add(new Bulldozer("Betta", "Blue", false, 4.5));
        bulldozers.add(new Bulldozer("Gamma", "Yellow", true, 7.0));
        return bulldozers;
    }
}
