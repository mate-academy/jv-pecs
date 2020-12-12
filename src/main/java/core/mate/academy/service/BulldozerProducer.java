package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(true, "Bulldozer1", "Yellow"));
        bulldozerList.add(new Bulldozer(false, "Bulldozer2", "Blue"));
        return bulldozerList;
    }
}
