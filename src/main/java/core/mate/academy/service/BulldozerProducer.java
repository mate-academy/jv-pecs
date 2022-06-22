package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("B-56", "white",6, 6000));
        bulldozers.add(new Bulldozer("B-66", "black", 3, 3000));
        return bulldozers;
    }
}
