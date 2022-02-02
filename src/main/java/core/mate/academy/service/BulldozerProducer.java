package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        bulldozerList.add(new Bulldozer("Beast", "yellow", 600, "CAT"));
        bulldozerList.add(new Bulldozer("Halk", "green", 900, "JCB"));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
