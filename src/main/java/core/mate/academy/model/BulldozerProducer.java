package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozerList = List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
        return bulldozerList;
    }
}
