package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers;

    public BulldozerProducer() {
        this.bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer(500, "Super Tracks"));
        bulldozers.add(new Bulldozer());
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
