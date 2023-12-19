package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> list = new ArrayList<>();

    public BulldozerProducer() {
        list.add(new Bulldozer("Big"));
        list.add(new Bulldozer("Huge"));
    }

    @Override
    public List<Bulldozer> get() {
        return list;
    }
}
