package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozerList;

    public BulldozerProducer(List<Bulldozer> content) {
        this.bulldozerList = content;
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
