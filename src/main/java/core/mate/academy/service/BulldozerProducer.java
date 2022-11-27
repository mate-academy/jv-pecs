package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Bulldog", "black",123,"SQ89"));
        bulldozers.add(new Bulldozer("BMW", "white", 589, "TQ68"));
        bulldozers.add(new Bulldozer("Lenovo", "pink", 478,"RYU56"));
        return bulldozers;
    }
}
