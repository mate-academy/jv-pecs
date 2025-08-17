package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    
    @Override
    public List<Bulldozer> get() {
        final Bulldozer mack = new Bulldozer("mack", "grey");
        final Bulldozer iveco = new Bulldozer("iveco", " white");
        final Bulldozer frightlaner = new Bulldozer("frightlaner", "yellow");
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(mack);
        bulldozers.add(iveco);
        bulldozers.add(frightlaner);
        return bulldozers;
    }
}
