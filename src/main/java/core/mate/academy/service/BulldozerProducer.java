package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        this.bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(12d));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
