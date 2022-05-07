package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("D", "red", 2500));
        bulldozerList.add(new Bulldozer("B", "blue", 2300));
        bulldozerList.add(new Bulldozer("B", "green", 1800));
        return bulldozerList;
    }
}



