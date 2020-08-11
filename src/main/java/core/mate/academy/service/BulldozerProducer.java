package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer bulldozer1 = new Bulldozer(1250, 300);
        Bulldozer bulldozer2 = new Bulldozer(1350, 400);
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        return bulldozerList;
    }
}
