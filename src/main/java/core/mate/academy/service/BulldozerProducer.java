package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("bullOne", "green", 5.5f));
        bulldozerList.add(new Bulldozer("bullTwo", "blue", 2.5f));
        bulldozerList.add(new Bulldozer("bullThree", "orange", 5.0f));
        return bulldozerList;
    }
}
