package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("yellow", "Komatsu",
                "straight", "construction"));
        bulldozers.add(new Bulldozer("gray", "Dressta",
                "u-blade", "farming"));
        return bulldozers;
    }
}
