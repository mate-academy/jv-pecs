package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        List<Machine> bulldozer = new ArrayList<>();
        bulldozer.add(new Bulldozer());
        return bulldozer;
    }
}
