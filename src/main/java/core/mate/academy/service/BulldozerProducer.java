package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("buldozerFirst", "red", 200));
        bulldozerList.add(new Bulldozer("buldozerSecond", "green", 300));
        bulldozerList.add(new Bulldozer("buldozerThird", "white", 500));
        return bulldozerList;
    }
}
