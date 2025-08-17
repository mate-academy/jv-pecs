package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Bulldozer 1", "SOLO company", 1500));
        bulldozerList.add(new Bulldozer("Bulldozer 2", "OSBB", 2000));
        bulldozerList.add(new Bulldozer("Bulldozer 2", "OSBB", 2000));
        bulldozerList.add(new Bulldozer("Bulldozer 3", "MMM", 1999));
        return bulldozerList;
    }
}
