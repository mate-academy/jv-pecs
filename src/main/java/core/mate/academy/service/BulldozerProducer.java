package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(255,643,"Bulldozer1","Red"));
        bulldozerList.add(new Bulldozer(145,351,"Bulldozer2","Blue"));
        return bulldozerList;
    }
}
