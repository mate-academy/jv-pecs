package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        return bulldozerList;
    }
}
