package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer(true, "Bulldozer1", "Yellow");
        Bulldozer bulldozer2 = new Bulldozer(true, "Bulldozer2", "Yellow");
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        return bulldozerList;
    }
}
