package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(2000, 800));
        bulldozers.add(new Bulldozer(1998, 750));
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }
}
