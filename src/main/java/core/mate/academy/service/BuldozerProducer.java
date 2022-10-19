package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.List;

public class BuldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer(),new Bulldozer());
    }
}
