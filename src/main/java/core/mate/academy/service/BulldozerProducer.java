package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(37, 73));
        bulldozerList.add(new Bulldozer(24, 42));
        bulldozerList.add(new Bulldozer(41, 44));
        return bulldozerList;
    }
}
