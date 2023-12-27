package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    public BulldozerProducer() {
        this.bulldozers.add(new Bulldozer(15.34, "Japan"));
        this.bulldozers.add(new Bulldozer(17.67, "China"));
        this.bulldozers.add(new Bulldozer(16.24, "Taiwan"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
