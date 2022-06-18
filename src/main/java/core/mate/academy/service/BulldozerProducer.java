package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("B-01", "red", 456));
        bulldozers.add(new Bulldozer("B-02", "green", 789));
        bulldozers.add(new Bulldozer("B-03", "gray", 90));
        return bulldozers;
    }
}
