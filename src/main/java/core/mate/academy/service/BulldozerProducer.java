package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozerList;

    public BulldozerProducer(List<Bulldozer> bulldozerList) {
        this.bulldozerList = bulldozerList;
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
