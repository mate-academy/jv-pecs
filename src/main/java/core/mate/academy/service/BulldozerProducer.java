package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozers = new ArrayList<>();

    public BulldozerProducer() {
        this.bulldozers.add(new Bulldozer(100, 1000));
        this.bulldozers.add(new Bulldozer(200, 500));
        this.bulldozers.add(new Bulldozer(300, 50));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers;
    }
}
