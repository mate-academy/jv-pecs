package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer<Bulldozer> implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozerList;

    public BulldozerProducer() {
        bulldozerList = new ArrayList<>();
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
