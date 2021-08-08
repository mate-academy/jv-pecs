package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("T1000", "yellow", 2006));
        bulldozerList.add(new Bulldozer("T2000", "red", 2008));
        bulldozerList.add(new Bulldozer("XCV400", "red", 2004));
        return bulldozerList;
    }
}
