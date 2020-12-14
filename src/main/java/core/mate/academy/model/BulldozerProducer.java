package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = List.of(new Bulldozer(), new Bulldozer(), new Bulldozer());
        return bulldozerList;
    }
}
