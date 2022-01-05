package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    static final Bulldozer mack = new Bulldozer("mack", "grey");
    static final Bulldozer iveco = new Bulldozer("iveco", " white");
    static final Bulldozer frightlaner = new Bulldozer("frightlaner", "yellow");

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(mack);
        bulldozers.add(iveco);
        bulldozers.add(frightlaner);
        return bulldozers;
    }
}
