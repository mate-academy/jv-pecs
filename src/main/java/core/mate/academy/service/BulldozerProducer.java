package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Bulldozer1", "red", 2, 2010));
        bulldozerList.add(new Bulldozer("Bulldozer2", "white", 2.2, 2010));
        bulldozerList.add(new Bulldozer("Bulldozer3", "blue", 2.5, 2010));
        return bulldozerList;
    }
}
