package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Crawler"));
        bulldozerList.add(new Bulldozer("Wheel"));
        bulldozerList.add(new Bulldozer("Mini"));
        return bulldozerList;
    }
}
